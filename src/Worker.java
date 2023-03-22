public class Worker extends Thread {

    private String name;
    private String product;
    private Integer time;

    public Worker(String name, String product, Integer time) {
        this.name = name;
        this.product = product;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(name.concat(" is currently working on: " + product));
            try {
                sleep((long) (Math.random() * time));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name.concat(" finished ").concat(product));
    }

}

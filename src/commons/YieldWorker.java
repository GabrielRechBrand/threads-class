package commons;

public class YieldWorker extends Thread {

    private String name;

    public YieldWorker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name.concat( " is working on: ").concat(String.valueOf(i)));
            Thread.yield();
        }
    }
}

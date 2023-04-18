package commons;

public class Producer implements Runnable {

    private Resource resource;
    private int time;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * getTime()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource.produce();
        }
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

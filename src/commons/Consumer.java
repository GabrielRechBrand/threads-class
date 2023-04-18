package commons;

public class Consumer implements Runnable {

    Resource resource;
    int time;

    public Consumer(Resource resource) {
        this.resource = resource;
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

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((int) (Math.random() * getTime()));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resource.consume();
        }
    }
}

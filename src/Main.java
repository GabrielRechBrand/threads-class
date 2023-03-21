import java.util.logging.Logger;

public class Main {

    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Active threads number: " + Thread.activeCount());
        logger.info("Current thread: " + Thread.currentThread().getName());

        System.out.println("Before opening the window: " + Thread.activeCount());
        MultiThread window = new MultiThread();
        window.setVisible(true);
        System.out.println("After opening the window: " + Thread.activeCount());
    }
}

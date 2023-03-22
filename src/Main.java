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

//        Worker gabe = new Worker("Gabe", "key", 500);
//        Worker jeff = new Worker("Jeff", "wallet", 250);
//        Worker mary = new Worker("Mary", "guitar", 2000);
//
//        gabe.start();
//        jeff.start();
//        mary.start();

        Worker jame = new Worker("Jame", "shoe", 500);
        Worker rose = new Worker("Rose", "shoe", 500);
        Worker mack = new Worker("Mack", "shoe", 500);

        jame.start();
        rose.start();
        mack.start();

    }
}

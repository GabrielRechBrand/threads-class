package main;

import commons.ThreadWorker;

import java.util.logging.Logger;

public class RunThreadWorkers {

    public static final Logger logger = Logger.getLogger(RunRunnableWorkers.class.getName());

    public static void main(String[] args) {
        logger.info("Active threads number: " + Thread.activeCount());
        logger.info("Current thread: " + Thread.currentThread().getName());

        ThreadWorker jame = new ThreadWorker("Jame", "shoe", 500);
        ThreadWorker rose = new ThreadWorker("Rose", "shoe", 500);
        ThreadWorker mack = new ThreadWorker("Mack", "shoe", 500);

        jame.start();
        rose.start();
        mack.start();
    }
}

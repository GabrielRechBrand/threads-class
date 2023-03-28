package main;

import commons.RunnableWorker;
import commons.ThreadWorker;

import java.util.logging.Logger;

public class RunRunnableWorkers {

    public static final Logger logger = Logger.getLogger(RunRunnableWorkers.class.getName());

    public static void main(String[] args) {
        logger.info("Active threads number: " + Thread.activeCount());
        logger.info("Current thread: " + Thread.currentThread().getName());

        RunnableWorker gabe = new RunnableWorker("Gabe", "key", 500);
        RunnableWorker jeff = new RunnableWorker("Jeff", "wallet", 250);
        RunnableWorker mary = new RunnableWorker("Mary", "guitar", 2000);

        gabe.run();
        jeff.run();
        mary.run();
    }
}

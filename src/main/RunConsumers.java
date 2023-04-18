package main;

import commons.Consumer;
import commons.Producer;
import commons.Resource;

public class RunConsumers {
    public static void main(String[] args) {
        Resource resource = new Resource();

        Consumer c1 = new Consumer(resource);
        Consumer c2 = new Consumer(resource);

        c1.setTime(750);
        c2.setTime(1000);

        Producer p1 = new Producer(resource);

        p1.setTime(1000);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(p1);
        Thread t3 = new Thread(c2);

        t1.start();
        t2.start();
        t3.start();
    }
}

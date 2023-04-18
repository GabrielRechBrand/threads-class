package main;

import commons.YieldWorker;

public class RunYeldWorker {
    public static void main(String[] args) {
        YieldWorker lloyd = new YieldWorker("Lloyd");
        YieldWorker foy = new YieldWorker("Foy");

        lloyd.start();
        foy.start();
    }
}

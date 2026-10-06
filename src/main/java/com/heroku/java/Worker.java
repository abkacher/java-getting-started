package com.heroku.java;

public class Worker {

    public void runWorker() throws InterruptedException {

        System.out.println("worker started!");

        while (true) {
            System.out.println("worker is running...");
            Thread.sleep(5000);
        }
    }
}

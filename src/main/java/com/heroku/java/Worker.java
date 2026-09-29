package com.heroku.java;

public class Worker {

    public void runWorker() throws InterruptedException {

        System.out.println("Worker started!");

        while (true) {
            System.out.println("Worker is running...");
            Thread.sleep(5000);
        }
    }
}

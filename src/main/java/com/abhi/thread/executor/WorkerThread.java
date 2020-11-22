package com.abhi.thread.executor;

public class WorkerThread implements Runnable {
    private String command;
    WorkerThread(String command) {
        this.command = command;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start. Command : " + command);
    }

    private void processCommand(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}



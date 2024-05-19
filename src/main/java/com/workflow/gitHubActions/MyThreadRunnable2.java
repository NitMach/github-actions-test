package com.workflow.gitHubActions;

public class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<100;i++){
            System.out.println("I am a 2 thread  " + " "+i);
        }
    }
}

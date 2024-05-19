package com.workflow.gitHubActions;

public class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println("I am a 1 thread  " +" "+ i);
        }
    }
}

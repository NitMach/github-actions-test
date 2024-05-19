package com.workflow.gitHubActions;

public class MyThreadClass extends Thread {

	public void run(){
		for(int i = 0; i<100;i++) {
			System.out.println("this is thread 3 created by extending Thread"+ i);
		}
	}

}

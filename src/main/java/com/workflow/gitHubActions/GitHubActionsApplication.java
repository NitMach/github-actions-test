package com.workflow.gitHubActions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionsApplication {

	public String welcome(){
		return "welcome to EARTH!";
	}

	public static void main(String[] args) {

		SpringApplication.run(GitHubActionsApplication.class, args);

		MyThreadClass t3 = new MyThreadClass();
		t3.start();
		t3.setPriority(10);

		MyThreadRunnable t1 = new MyThreadRunnable();
		Thread x = new Thread(t1);
		System.out.println(x.getState() + "STATE");
		MyThreadRunnable2 t2 = new MyThreadRunnable2();
		Thread y = new Thread(t2);

		x.start();
		System.out.println(x.getState() + "STATE");

//		x.setDaemon(true);
		y.start();
		System.out.println(x.getState() + "STATE");
		//Signifies the main method does not wait for the other threads to finish it completes its entire exceution and
		// wait
		System.out.println("execution ended in main function");
	}

}

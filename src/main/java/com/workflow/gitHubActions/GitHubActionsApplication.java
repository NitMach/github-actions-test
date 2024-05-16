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
	}

}

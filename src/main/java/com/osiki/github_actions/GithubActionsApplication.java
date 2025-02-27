package com.osiki.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {



	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to class";
	}


	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

/**
 * 1. Create a spring project
 * 2. Expose a simple endpoint inside the main class
 * 3. push the project to github
 * 4. Go to Actions and select java with maven
 * 5. edit the name and run
 * 6. commit the changes to a new branch
 */

}

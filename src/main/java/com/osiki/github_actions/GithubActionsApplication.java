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

//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Danny4life/my-github-actions.git
//	git push -u origin main

}

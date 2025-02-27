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
 * 5. edit the name and run line
 * 6. commit the changes to a new branch
 * 7. write the docker command on maven.yml file
 * 8. signin to docker hub and create a repo
 * 9. add the repo name to the image
 * 10. add the jar name demo image on pom.xml inside finalName tag
 * 11. create a dockerfile inside the root
 * 12. create secrets DOCKER_USERNAME (aniel1089) and DOCKER PASSWORD(SCHool0000dummy) on github repo - settings - secret and variables - new actions - repository
 * 13. push to github
 * 14. go to docker hub to check the image pushed
 * 15. start docker desktop so you can pull the image
 * 16. open the terminal and paste the docker pull command gotten from docker hub
 * 17. run docker images - to check list of images
 * 18. run the docker image - docker run -p 8080:8080 aniel1089/demo-image
 * 19. now go to the browser localhost:8080/welcome
 *
 */

}

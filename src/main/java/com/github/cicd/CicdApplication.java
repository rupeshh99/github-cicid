package com.github.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {

	@GetMapping("/welcome")
	public String getMessage(){
		return "ATTABOY !! KEEP DOING";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
//echo "# github-cicid" >> README.md
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/rupeshh99/github-cicid.git
//		git push -u origin main
package com.anushka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
  model.addAttribute(
                "title",
                "Production CI/CD Pipeline using Jenkins, SonarQube, Docker and ArgoCD"
        );

        model.addAttribute(
                "msg",
                "Automated GitOps deployment using Jenkins, Kubernetes and ArgoCD"
        );

        return "index";
    }

    @GetMapping("/health")
@ResponseBody
public String health() {
    return "Application Healthy";
}


    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}


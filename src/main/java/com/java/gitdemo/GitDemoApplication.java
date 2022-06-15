package com.java.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public void addData(String data){
        System.out.println("Data :"+data);
    }

    public static void main(String[] args) {
        SpringApplication.run(GitDemoApplication.class, args);
        GitDemoApplication gitDemoApplication = new GitDemoApplication();
        gitDemoApplication.addData("Yakub");
    }

}

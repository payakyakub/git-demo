package com.java.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public void addData(String data){
        if(data.equals("Java")){
            System.out.println("Wel Come to Java World");
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(GitDemoApplication.class, args);
        GitDemoApplication gitDemoApplication = new GitDemoApplication();
        gitDemoApplication.addData("Yakub");
    }

}

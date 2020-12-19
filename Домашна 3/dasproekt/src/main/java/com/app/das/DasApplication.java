package com.app.das;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
@SpringBootApplication
@ServletComponentScan
public class DasApplication {
    public static void main(String[] args) {
        SpringApplication.run(DasApplication.class, args);
    }
}
package oit.is.team0805.lec05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class Lec05Application {

  public static void main(String[] args) {
    SpringApplication.run(Lec05Application.class, args);
  }

}

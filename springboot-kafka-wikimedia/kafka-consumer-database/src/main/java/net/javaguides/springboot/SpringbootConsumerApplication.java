package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("net.javaguides.springboot.repository")
@EntityScan("net.javaguides.springboot.entity")

public class SpringbootConsumerApplication {
    public static void main(String[] args) {
         SpringApplication.run(SpringbootConsumerApplication.class);
    }
}

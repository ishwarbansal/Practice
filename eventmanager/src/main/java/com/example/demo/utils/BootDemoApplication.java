package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import javax.sql.DataSource;

import com.example.demo.repository.UserRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.*"})
@EnableJpaRepositories("com.example.demo.*")
@EntityScan("com.example.demo.*")
public class BootDemoApplication {
	@Autowired
	DataSource dataSource;
	@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}
}

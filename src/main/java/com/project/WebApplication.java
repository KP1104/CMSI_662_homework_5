package com.project;

import com.project.entity.Admin;
import com.project.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {

	@Autowired
	AdminRepository adminRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
//
//	@Override
//	public void run(String... args) {
//		Admin admin = new Admin();
//
//		adminRepository.save(admin);
//	}

	@Override
	public void run(String... args) {
		int count = adminRepository.countByUserIdAndPassword("kp11","kp");
		System.out.println(count);
		//return count;
	}
}

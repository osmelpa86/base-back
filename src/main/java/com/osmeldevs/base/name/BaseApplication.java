package com.osmeldevs.base.name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {
		"com.osmeldevs.base.name.application.bean",
		"com.osmeldevs.base.name.application.controller",
		"com.osmeldevs.base.name.application.configuration",
		"com.osmeldevs.base.name.domain.exception"
})
public class BaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(BaseApplication.class, args);
	}
}

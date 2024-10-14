package com.osmeldevs.base.name.application.bean;

import com.osmeldevs.base.name.application.controller.common.error.response.ErrorsResponseCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Helper {

	@Bean
	public ErrorsResponseCreator errorsResponseCreator() {
		return new ErrorsResponseCreator();
	}
}

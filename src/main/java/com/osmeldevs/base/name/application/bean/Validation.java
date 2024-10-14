package com.osmeldevs.base.name.application.bean;

import com.osmeldevs.base.name.application.validator.*;
import com.osmeldevs.base.name.application.validator.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Validation {

	@Bean
	public ParameterValueSelector parameterValueSelector() {
		return new ParameterValueSelector();
	}

	@Bean
	public AccountTypeOrderValidator accountTypeOrderValidator() {
		return new AccountTypeOrderValidator();
	}

	@Bean("pageValidator")
	public Validator<Integer> pageValidator() {
		return new PageValidator();
	}

	@Bean("sizeValidator")
	public Validator<Integer> sizeValidator() {
		return new SizeValidator();
	}
}

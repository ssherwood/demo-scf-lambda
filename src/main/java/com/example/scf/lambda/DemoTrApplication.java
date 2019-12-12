package com.example.scf.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class DemoTrApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoTrApplication.class, args);

		//FunctionRegistry reg = ctx.getBean(FunctionRegistry.class);
		//Function<String, String> fn = reg.lookup("uppercase|strong");
		//System.out.println(fn.apply("hello"));
	}

	@Bean
	Function<String, String> uppercase() {
		return s -> s.toUpperCase();
	}

	@Bean
	Function<String, String> strong() {
		return s -> s + "!!!";
	}
}

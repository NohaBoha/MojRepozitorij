package com.in28minutes.lean_spring_framework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.lean_spring_framework.game.GameRunner;
import com.in28minutes.lean_spring_framework.game.GamingConsole;

@Configuration
@ComponentScan

public class SipmpleSpringContextLauncherApplication {	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext
				(SipmpleSpringContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}

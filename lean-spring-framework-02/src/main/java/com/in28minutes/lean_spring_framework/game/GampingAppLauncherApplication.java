package com.in28minutes.lean_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.lean_spring_framework.game")

public class GampingAppLauncherApplication {	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext
				(GampingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}

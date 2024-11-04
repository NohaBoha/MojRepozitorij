package com.in28minutes.lean_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.lean_spring_framework.game.GameRunner;
import com.in28minutes.lean_spring_framework.game.GamingConsole;

@Component
class YourBusinessClass{	
	
	Dependency dependency;
	Dependency2 dependency2;
	
	//@Autowired
	public YourBusinessClass(Dependency dependency, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass");
		this.dependency = dependency;
		this.dependency2 = dependency2;
	}
	
//	@Autowired
//	public void setDependency(Dependency dependency) {
//		System.out.println("Setter Injection - setDependency");
//		this.dependency = dependency;
//	}

//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - setDependency2");
//      this.dependency2 = dependency2;
// 		}

	public String toString() {
		return "Using: " + dependency + " and " + dependency2;
	}
}
@Component
class Dependency{
}
@Component
class Dependency2{}


@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext
				(DepInjectionLauncherApplication.class)) {
			
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			//System.out.println(context.getBean(YourBusinessClass.class));
		}

	}

}

package kr.re.kitri.springdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Springdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo2Application.class, args);
	}

}

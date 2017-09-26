package api;

import jdk.nashorn.internal.runtime.Debug;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
		System.out.println("osea jelou!");
	}
}

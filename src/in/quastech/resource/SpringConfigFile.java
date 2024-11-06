package in.quastech.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.quastech.bean.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	Student stdobj() {
		Student std=new Student();
		std.setRollno(101);
		std.setName("Raj");
		std.setMarks(70);
		return std;
		
	}

}

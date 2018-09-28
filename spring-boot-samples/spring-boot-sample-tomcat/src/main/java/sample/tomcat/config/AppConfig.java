package sample.tomcat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/15
 */
@Configuration
public class AppConfig {
	@Bean
	public Person person(){
		return new Person();
	}
}

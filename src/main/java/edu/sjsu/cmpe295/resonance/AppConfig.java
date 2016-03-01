package edu.sjsu.cmpe295.resonance;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@EnableAutoConfiguration
@ComponentScan(basePackages = "edu.sjsu.cmpe295.resonance")
@Configuration
@EnableTransactionManagement
public class AppConfig extends WebMvcConfigurerAdapter {

}

package com.journaldev.config;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
 
import com.journaldev.drivers.DataBaseDriver;
import com.journaldev.drivers.MySqlDriver;
import com.journaldev.drivers.OracleDriver;
 
@Configuration
@ComponentScan("com.journaldev")
@PropertySource("classpath:oracledatabase.properties")
public class AppConfig {
 
	@Autowired
        Environment environment;
	
	@Bean
	DataBaseDriver oracleDriver() {
        OracleDriver oracleDriver = new OracleDriver();
	oracleDriver.setDriver(environment.getProperty("db.driver"));
        oracleDriver.setUrl(environment.getProperty("db.url"));
        oracleDriver.setPort(Integer.parseInt(environment.getProperty("db.port")));
        oracleDriver.setUser(environment.getProperty("db.user"));
        oracleDriver.setPassword(environment.getProperty("db.password"));
 
        return oracleDriver;
 
	}
 
	@Bean
	DataBaseDriver mysqlDriver() {
		return new MySqlDriver();
	}
}

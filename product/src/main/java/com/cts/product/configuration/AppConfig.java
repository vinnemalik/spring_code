package com.cts.product.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = {@ComponentScan("com.cts.product.dao"),
		@ComponentScan("com.cts.product.service")})

public class AppConfig {
	
	@Autowired	
	private Environment environment;
		
}


//class used for config purpose @ ne ye btaya
//ComponentScan(value = "com.cts.product") aise be likh skte h
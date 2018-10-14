/**
 * 
 */
package com.d2l2c.paychecks.management.service.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.d2l2c.paychecks.management.service.worker.PaychecksServiceWorker;
import com.d2l2c.paychecks.management.service.worker.impl.PaychecksServiceWorkerImpl;

/**
 * @author dayanlazare
 *
 */
@Configuration
@PropertySource(value = "classpath:app-test.properties", ignoreResourceNotFound = true)
@ComponentScans(value = { @ComponentScan("com.d2l2c.paychecks.management.service") })
public class PaychecksServiceConfig {

	@Autowired
	private Environment environment;

	@Bean
	public PaychecksServiceWorker paychecksServiceWorker() {
		PaychecksServiceWorkerImpl paychecksServiceWorker = new PaychecksServiceWorkerImpl();
		paychecksServiceWorker.setUrl(environment.getRequiredProperty("paychecks.api.url"));
		return paychecksServiceWorker;
	}

}

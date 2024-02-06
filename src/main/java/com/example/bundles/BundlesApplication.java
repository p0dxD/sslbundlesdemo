package com.example.bundles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ssl.SslBundles;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BundlesApplication {

	/**
	 * A description of the entire Java function.
	 *
	 * @param  restTemplateBuilder	description of parameter
	 * @param  sslBundles	        description of parameter
	 * @return         	        description of return value
	 */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder, SslBundles sslBundles) {
		return restTemplateBuilder.setSslBundle(sslBundles.getBundle("secure-service")).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(BundlesApplication.class, args);
	}

}

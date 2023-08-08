package com.sakshath.core.constant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.sakshath.core.serviceImpl.AuditorAwareImpl;

@Configuration
@EnableJpaAuditing
public class AuditConfig {

	@Bean
	public AuditorAware<String> auditorAware(){
		
		return new AuditorAwareImpl();
	}
}

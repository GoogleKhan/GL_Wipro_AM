//package com.greatlearning.security.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//		auth.inMemoryAuthentication().withUser("shadab").password(getEncoder().encode("1234")).roles("STORE_OWNER")
//				.and().withUser("Chandra").password(getEncoder().encode("4321")).roles("STORE_CLERK");
//	}
//
//	@Bean
//	public PasswordEncoder getEncoder() {
//		// return NoOpPasswordEncoder.getInstance();
//
//		return new BCryptPasswordEncoder();
//	}
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/h2-console/**");
//	}
//}

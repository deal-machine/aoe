package br.com.dealmachine.mvc.aoe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	//authorization
		http
			.authorizeRequests()
				.anyRequest().authenticated()
			.and()
				.formLogin(form -> form.loginPage("/login").permitAll())
				.logout(logout -> logout.logoutSuccessUrl("/logout"));
	}
	
	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		
		//authentication
		UserDetails user = 
				User.withDefaultPasswordEncoder()
					.username("95deal")
					.password("deal")
					.roles("ADM")
					.build();
		
		return new InMemoryUserDetailsManager(user);
	}
}

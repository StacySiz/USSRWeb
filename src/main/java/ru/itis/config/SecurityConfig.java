
package ru.itis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import ru.itis.security.details.UserDetailsServiceImpl;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private AuthProvider authProvider;

  @Autowired
  private UserDetailsService userDetailsService;

  @Autowired
  private AuthenticationProvider authenticationProvider;


//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.userDetailsService(userDetailsService);
////    auth.authenticationProvider(authProvider);
//    auth.authenticationProvider(authenticationProvider);
//  }

//  @Autowired
//  private UserDetailsServiceImpl detailsService;
//
//  @Autowired
//  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    auth.authenticationProvider(authProvider);
//  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
            .anyRequest().permitAll()
//            .anyRequest().authenticated()
//                .antMatchers("/user/**").hasAuthority("USER")
//            .antMatchers("/index").permitAll()
            .antMatchers("/profile").fullyAuthenticated()
//            .antMatchers("/resources/css/*").permitAll()
//            .antMatchers("/resources/pics/*").permitAll()
//            .antMatchers("/").permitAll()
//            .and()
            .and()
            .formLogin().loginPage("/signIn")
            .usernameParameter("email")
            .passwordParameter("password")
            .defaultSuccessUrl("/profile")
            .failureUrl("/signIn?error")
            .permitAll()
            .and()
            .logout()
            .logoutUrl("/logout")
            .logoutSuccessUrl("/signIn")
            .permitAll();
//            .and()
//            .csrf();
    http.csrf().disable();
  }
//
//  @Bean
//  public UserDetailsServiceImpl detailsService(){
//    return new UserDetailsServiceImpl();
//  }

//  @Bean
//  public AuthProvider authProvider(){
//    return new AuthProvider();
//  }

  @Autowired
  public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService);
    auth.authenticationProvider(authenticationProvider);
  }
  @Bean
  public PasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
  }


}

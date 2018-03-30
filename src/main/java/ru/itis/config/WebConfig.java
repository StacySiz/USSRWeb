package ru.itis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import ru.itis.repositories.UserRepository;
import ru.itis.services.UserServiceImpl;
import ru.itis.utils.UserValidator;

@Configuration
@ComponentScan("ru.itis")
@Import({ViewResolverConfig.class})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    public void addResourceHandlers( ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean(name = "validator")
    public UserValidator userValidator(){
        return new UserValidator();
    }
    @Bean(name = "userService")
    public UserServiceImpl userService(){
        return new UserServiceImpl();
    }

}

package ru.itis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import ru.itis.converters.StringToGameConverter;
import ru.itis.services.GameService;
import ru.itis.services.implementation.GameServiceImpl;
import ru.itis.services.implementation.UserAuthenticationServiceImpl;
import ru.itis.services.implementation.UserRegistrationServiceImpl;
import ru.itis.utils.UserValidator;

@Configuration
@ComponentScan("ru.itis")
@Import({ViewResolverConfig.class})
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean(name = "validator")
    public UserValidator userValidator() {
        return new UserValidator();
    }

    @Bean(name = "userService")
    public UserRegistrationServiceImpl userService() {
        return new UserRegistrationServiceImpl();
    }

    @Bean
    public GameService gameService() {
        return new GameServiceImpl();
    }

    @Bean
    public StringToGameConverter gameConverter() {
        return new StringToGameConverter();
    }

    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(gameConverter());
    }

    @Bean
    public UserAuthenticationServiceImpl authenticationService() {
        return new UserAuthenticationServiceImpl();
    }
}

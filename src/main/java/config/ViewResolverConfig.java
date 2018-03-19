package config;

import org.jtwig.spring.JtwigView;
import org.jtwig.spring.JtwigViewResolver;
import org.jtwig.web.servlet.JtwigRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("controllers")
@EnableWebMvc
public class ViewResolverConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver viewResolver(){
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        JtwigViewResolver resolver = new JtwigViewResolver();
        resolver.setRenderer(JtwigRenderer.defaultRenderer());
        resolver.setPrefix("WEB-INF/views/");
        resolver.setSuffix(".twig.html");
        resolver.setViewClass(JtwigView.class);
        resolver.setRedirectContextRelative(false);
        return resolver;
    }
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}

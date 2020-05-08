package com.jjlin;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
 
@Configuration
@EnableWebMvc
@ComponentScan
public class MvcConfiguration extends WebMvcConfigurerAdapter
{
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        registry.viewResolver(resolver);
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

       // Register resource handler for CSS and JS
       registry.addResourceHandler("/resources/**").addResourceLocations("/static/")
             .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());

       // Register resource handler for images
       registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
             .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
    }
}
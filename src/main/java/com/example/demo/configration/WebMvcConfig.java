package com.example.demo.configration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.Charset;
import java.util.List;

@Configuration
class WebMvcConfig extends WebMvcConfigurationSupport {
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/pages/**")
        .addResourceLocations("classpath:/templates/pages/");
    registry.addResourceHandler("/layui/**")
        .addResourceLocations("classpath:/templates/layui/");
    registry.addResourceHandler("/img/**")
        .addResourceLocations("classpath:/templates/img/");
    registry.addResourceHandler("/css/**")
        .addResourceLocations("classpath:/templates/css/");
    registry.addResourceHandler("/js/**")
        .addResourceLocations("classpath:/templates/js/");
    registry.addResourceHandler("/favicon.ico")
        .addResourceLocations("classpath:/templates/favicon.ico");
  }

  //处理controller返回json中文乱码问题
  @Override
  public void configureMessageConverters(
      List<HttpMessageConverter<?>> converters) {
    super.configureMessageConverters(converters);
    converters.add(new StringHttpMessageConverter(
        Charset.forName("UTF-8")));
  }

  @Override
  public void configureContentNegotiation(
      ContentNegotiationConfigurer configurer) {
    configurer.favorPathExtension(false);
  }


}


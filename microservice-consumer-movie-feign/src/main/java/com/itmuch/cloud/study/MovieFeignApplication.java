package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

import com.netflix.config.ConfigurationManager;

/**
 * 使用@EnableFeignClients开启Feign
 * @author eacdy
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MovieFeignApplication {
  public static void main(String[] args) {
    SpringApplication.run(MovieFeignApplication.class, args);
  }
  
  @Bean
  public EmbeddedServletContainerCustomizer containerCustomizer() {
	  
     return (container -> {
          ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
          ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
          ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");

          container.addErrorPages(error401Page, error404Page, error500Page);
     });
  } 
  
  @Bean
  ProtobufHttpMessageConverter protobufHttpMessageConverter() {
      return new ProtobufHttpMessageConverter();
  }  
}

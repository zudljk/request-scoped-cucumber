package com.maihiro.cucumbertest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

  @Bean
  @Scope("request")
  public DataObjectService dataObjectService() {
    return new DataObjectService();
  }

  @Bean("dependency")
  @Scope("request")
  public String dependencyBean() {
    return "dependency bean";
  }

}

package io.github.zudljk.cucumbertest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

  @Bean
  @Scope("request")
  public ExampleService exampleService() {
    return new ExampleService();
  }

  @Bean("dependency")
  @Scope("request")
  public String dependencyBean() {
    return "dependency bean";
  }

}

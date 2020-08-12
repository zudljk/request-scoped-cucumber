package io.github.zudljk.cucumbertest;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(classes = AppConfig.class)
@CucumberContextConfiguration
@WebAppConfiguration
public class TestBase {

  @Autowired
  public ExampleService underTest;
}
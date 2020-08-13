package io.github.zudljk.cucumbertest;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(classes = {AppConfig.class})
@CucumberContextConfiguration
@WebAppConfiguration
@TestExecutionListeners(ClassLevelServletTestExecutionListener.class)
// extend the Spring class to get the default TestExecutionListeners
public class TestBase extends AbstractJUnit4SpringContextTests {

  @Autowired
  public ExampleService underTest;
}
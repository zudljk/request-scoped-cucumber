package io.github.zudljk.cucumbertest.cucumbertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExampleService {

  @Autowired
  @Qualifier("dependency")
  String dependencyBean;

  public String process() {
    return "I have a "+dependencyBean;
  }
}

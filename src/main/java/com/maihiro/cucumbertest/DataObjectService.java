package com.maihiro.cucumbertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class DataObjectService {

  @Autowired
  @Qualifier("dependency")
  String dependencyBean;

  public String process1() {
    return "I have a "+dependencyBean;
  }

  public String process2() {
    return "I have a pen";
  }

  public String process3() {
    return "Uh. "+dependencyBean+" pen.";
  }

}

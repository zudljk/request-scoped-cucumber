package com.maihiro.cucumbertest;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class DataObjectServiceTest {

  @Autowired
  public DataObjectService underTest;

  @Test
  public void test1() {
    assertThat(underTest.process1()).isEqualTo("I have a dependency bean");
  }

  @Test
  public void test2() {
    assertThat(underTest.process2()).isEqualTo("I have a pen");
  }

}
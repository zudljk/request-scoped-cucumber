package io.github.zudljk.cucumbertest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ExampleServicePlainSpringTest extends TestBase {

  @Test
  public void whenProcessingDataThenResultShouldBeReturned() {
    assertThat(this.underTest.process()).isEqualTo("I have a dependency bean");
  }

}

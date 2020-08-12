package io.github.zudljk.cucumbertest;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStepDefinitions extends TestBase {

  private String result;

  @When("I process data")
  public void iProcessData() {
    result = this.underTest.process();
  }

  @Then("the result should be returned")
  public void checkResult() {
    assertThat(result).isEqualTo("I have a dependency bean");
  }
}

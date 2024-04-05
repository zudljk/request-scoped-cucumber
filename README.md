This repository exemplifies how to make use of Spring's ServletTestExecutionListener for Cucumber tests.

ServletTestExecutionListener initializes the request context in the beforeTestMethod() method, however Cucumber tests don't have test methods, so this listener method is never called.

The solution is to implement a class-level TestExecutionListener and delegate to ServletTestExecutionListener.beforeTestMethod() in the custom listener's beforeTestClass() method.

Refer to this StackOverflow question for an in-detail analysis of the problem:
https://stackoverflow.com/questions/63373893/request-scoped-beans-not-working-in-spring-tests-with-cucumber

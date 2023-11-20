package latiha.unittesting.app.generator;

import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayNameGenerator.Simple;

public class SimpleDisplayNameGenerator extends Simple {

  @Override
  public String generateDisplayNameForClass(Class<?> testClass) {
    return "Test " + testClass.getSimpleName();
  }

  @Override
  public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
    return "Test " + testClass.getSimpleName() + "." + testMethod.getName();
  }

  @Override
  public String generateDisplayNameForNestedClass(Class<?> testClass) {
    return null;
  }

}

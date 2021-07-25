package com.example;

import java.lang.reflect.Method;

public class ReflectExample {

  public static void main(String[] args) throws Exception {
    String className = args[0];
    Class<?> clazz = Class.forName(className);
    Method method = clazz.getDeclaredMethod("sayHi", String.class);
    Object instance = clazz.getDeclaredConstructors()[0].newInstance();
    Object result = method.invoke(instance, "wuxin");
    System.out.println(result);
  }

}
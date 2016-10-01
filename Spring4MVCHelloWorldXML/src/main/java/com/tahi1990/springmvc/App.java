package com.tahi1990.springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
  private static ApplicationContext context;

  public static void main(String[] args) {
    context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-mvc-config.xml");
    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    obj.getMessage();
  }
}

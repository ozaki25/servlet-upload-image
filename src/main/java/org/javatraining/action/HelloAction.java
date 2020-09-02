package org.javatraining.action;

import javax.servlet.http.HttpServletRequest;
import org.javatraining.service.HelloService;

public class HelloAction extends Action {
  private final HelloService service = new HelloService();

  @Override
  protected String processRequest(HttpServletRequest request) {
    String hello = service.hello();
    System.out.println(hello);
    request.setAttribute("hello", hello);
    return "hello.jsp";
  }
}

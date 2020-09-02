package org.javatraining.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.javatraining.action.Action;
import org.javatraining.action.ActionFactory;

@WebServlet(urlPatterns = { "/upload" })
@MultipartConfig
public class UploadController extends HttpServlet {

  @Override
  protected void doGet(
    HttpServletRequest request,
    HttpServletResponse response
  )
    throws ServletException, IOException {
    doPost(request, response);
  }

  @Override
  protected void doPost(
    HttpServletRequest request,
    HttpServletResponse response
  )
    throws ServletException, IOException {
    String strActionName = request.getParameter("action_name");
    Action action = ActionFactory.getInstance(strActionName);
    String forwardPath = action.execute(request);
    RequestDispatcher rd = request.getRequestDispatcher(forwardPath);

    rd.forward(request, response);
  }
}

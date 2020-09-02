package org.javatraining.action;

import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

// import org.javatraining.service.UploadService;

public class UploadAction extends Action {

  // private final UploadService service = new UploadService();

  @Override
  protected String processRequest(HttpServletRequest request) {
    try {
      String name = request.getParameter("name");
      Part filePart = request.getPart("file");
      InputStream fileContent = filePart.getInputStream();

      System.out.println("name: " + name);
      System.out.println("filePart: " + filePart);

      request.setAttribute("hello", "アップロードしました！");
    } catch (Exception e) {}
    return "hello.jsp";
  }
}

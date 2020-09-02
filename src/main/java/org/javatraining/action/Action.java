package org.javatraining.action;

import java.io.IOException;
import java.sql.SQLException;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;

public abstract class Action {

  public String execute(HttpServletRequest request) throws IOException {
    try {
      return processRequest(request);
    } catch (SQLException | NamingException e) {
      return null;
    }
  }

  protected abstract String processRequest(HttpServletRequest request)
    throws SQLException, NamingException, IOException;
}

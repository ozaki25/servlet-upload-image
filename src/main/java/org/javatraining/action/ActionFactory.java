package org.javatraining.action;

public class ActionFactory {

  public static Action getInstance(String actionName) {
    if (actionName == null) {
      return null;
    }

    switch (actionName) {
      case "hello":
        return new HelloAction();
      case "upload":
        return new UploadAction();
      default:
        return null;
    }
  }
}

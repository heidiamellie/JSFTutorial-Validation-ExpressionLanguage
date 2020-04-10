package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class SimpleBean {
  private String[] colors =
    { "pink", "blue", "yellow" };
  
  public String getMessage() {
    return("Hi !! This is Heidi Amellie !!! Nice to Meet You!!");
  }
  
  public String[] getColors() {
    return(colors);
  }
}
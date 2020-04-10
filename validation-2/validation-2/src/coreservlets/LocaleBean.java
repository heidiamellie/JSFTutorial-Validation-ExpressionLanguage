package coreservlets;

import java.io.Serializable;
import java.util.Locale;
import javax.faces.bean.*;

@ManagedBean
@SessionScoped
public class LocaleBean implements Serializable {
  private final static Locale ENGLISH = new Locale("en");
  private final static Locale SPANISH = new Locale("es");
  private final static Locale PIKA = new Locale("pk");
  private Locale currentLocale=ENGLISH;
  
  public Locale getCurrentLocale() {
    return(currentLocale);
  }

  public String setEnglish() {
    currentLocale=ENGLISH;
    return null;
  }
  
  public String setSpanish() {
    currentLocale=SPANISH;
    return null;
  }
  public String setPika() {
    currentLocale=PIKA;
    return null;
  }  
}

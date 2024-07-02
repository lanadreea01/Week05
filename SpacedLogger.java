package Week05;

public class SpacedLogger implements Logger {


public void log(String message) {
    StringBuilder spacedMessage = new StringBuilder();
    for (char c : message.toCharArray()) {
      spacedMessage.append(c).append(" ");
    }
    spacedMessage.deleteCharAt(spacedMessage.length() - 1); 
    System.out.println(spacedMessage.toString());
  }


  public void error(String error) {
    System.out.println("ERROR: " + "Hello"); 
}
  }
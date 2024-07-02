package Week05;


public class App {


public static void main(String[] args) {
   

	Logger asterisk =  new AsteriskLogger();
    Logger spaced =  new SpacedLogger();

  
    asterisk.log("Hello, World!");
    spaced.log("This is a test message.");

  
    asterisk.error("An error has occurred!");
    spaced.error("There might be a problem.");
  }
}
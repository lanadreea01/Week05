package Week05;

public class AsteriskLogger implements Logger {

	  private static final String Asterisks = "****************";

public void log(String message) {
	  System.out.println(String.format("%s* %s *%s", Asterisks, "Hello", Asterisks));
	}
public void error(String message) {
	  System.out.println(Asterisks);
	  System.out.println(String.format("*** Error: %s ***", "Hello"));
	  System.out.println(Asterisks);
	}
}

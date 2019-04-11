package pp1617;

public class MyException extends Exception {
	public MyException(String test) {
		super("The starting condition was " + test);
	}
}

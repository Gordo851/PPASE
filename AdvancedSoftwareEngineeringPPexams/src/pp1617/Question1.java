package pp1617;

public class Question1 {
	public static void main(String [] args) {
		String test = "true";
		try {
			System.out.println("Start program");
			runRiskProgram(test);
			System.out.println("terminate that program");
		}
		catch (MyException me) {
			System.out.println(me);
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("end of main");
	}

	static void runRiskProgram(String test) throws MyException {
		System.out.println("Start my risky program");
		if("true".equals(test)) {
			throw new MyException(test);
		}
		System.out.println("end of my risky program");	
		return;	
	}
		
	
}

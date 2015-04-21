
public class LabeledLoops {

	public static void main(String[] args) {
		
		String[] programmers = {"Outer", "Inner"};
		
		outer:
			for (String outer : programmers) {	
				for (String inner : programmers) {
					if(inner.equals("Inner"))
						continue outer;
					System.out.println(inner + ":");
				}
			}
		
		System.out.println("Done");
	}

}

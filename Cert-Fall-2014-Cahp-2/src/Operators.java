

class Foo {
	static int y;
	int x;
	boolean b;

	Foo() {
		System.out.println("x is: " + x);
		System.out.println("b is: " + b);
	}

}
	
public class Operators {

	
	static int x;
	static float z;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float q = 1000000000000000000000000000000000.0f;
		
		q += 10.022;
		q *= 5;
		q /= 3;
		
		System.out.println(q);

		x += 4;
		z += 2.5;
		
		System.out.println(x);
		System.out.println(z);
		
		System.out.println(new Foo());
		
		boolean isItTrue = true;
		System.out.println(isItTrue);
		
		int i = 5;
		System.out.println(i);
		i++;
		System.out.println(i);
		i = ++i;
		System.out.println(i);
		
		for (int j = 0; j < 10; j++) {
			if (j == 5)
				break;
			System.out.println(j);
		}
		
	}

}

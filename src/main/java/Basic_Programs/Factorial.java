package Basic_Programs;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact = 1;
		for(int i=num;i>0;i--) {
			fact = fact*i;
		}
		System.out.println("Factorial: "+fact);

	}

}


//5: 5*4*3*2*1
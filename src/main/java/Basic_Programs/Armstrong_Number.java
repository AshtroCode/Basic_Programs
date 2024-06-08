package Basic_Programs;

public class Armstrong_Number {

	public static void main(String[] args) {
		int num = 153;
		int sum=0;
		String numstr = String.valueOf(num);
		System.out.println("Numstr: "+numstr);
		for(int i=0;i<numstr.length();i++) {
			int digit = Character.getNumericValue(numstr.charAt(i));
			System.out.println("Digit: "+digit);
			sum = sum+digit*digit*digit;
			System.out.println("Sum: "+sum);
		}
		if(sum==num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}
	}

}

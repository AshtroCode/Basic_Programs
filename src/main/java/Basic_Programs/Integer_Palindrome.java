package Basic_Programs;

public class Integer_Palindrome {

	public static void main(String[] args) {
		int num=100001;
		String rev = "";
		String numstr = String.valueOf(num);
		System.out.println("Num: "+num);
		for(int i=numstr.length()-1;i>=0;i--) {
			rev = rev+numstr.charAt(i);
		}
		System.out.println("Rev: "+rev);
		if(Integer.parseInt(rev)==num) {
			System.out.println("Interger Palindrome");
		}
		else System.out.println("Integer not palindrome");

	}

}

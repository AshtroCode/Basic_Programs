package Basic_Programs;

public class String_Palindrome {

	public static void main(String[] args) {
		String str = "Mom";
		String rev = "";
		System.out.println("String: "+str);
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse: "+rev);
		if(rev.equals(str)) {
			System.out.println("Palindrome");
		}
		else System.out.println("Not palindrome");
	}
}

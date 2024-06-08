package Basic_Programs;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		boolean status=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				status=false;
				break;
			}
			else {
				status=true;
			}
		}
		if(status || num==2) {
			System.out.println("Prime");
		}
		else System.out.println("Not prime");
	}

}

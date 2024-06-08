package Basic_Programs;

public class Fibonacci_series {

	public static void main(String[] args) {
		int num = 10;
		int first=1;
		int sec = 2;
		for(int i=1;i<=num;i++) {
			int sum = first+sec;
			System.out.println(sum);
			first=sec;
			sec=sum;
		}

	}

}

// 1,2,3,5,8
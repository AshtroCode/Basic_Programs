package Basic_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class remove_repeated_element_array {

	public static void main(String[] args) {
		int[] intarr = {1,2,3,4,5,83,23,4,3,2,1,0};
		Arrays.sort(intarr);
		
		Set<Object> intSet = Arrays.stream(intarr).boxed().collect(Collectors.toSet());
		
		System.out.println("List: "+intSet);
		for(int i=0;i<intarr.length-2;i++) {
			if(intarr[i]==intarr[i+1]) {
				intarr[i]=0;
			}
		}
		Arrays.sort(intarr);
		for (int i:intarr) {
			System.out.println(i);
		}
		

	}

}

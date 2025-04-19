package ArraysPractice;
import java.util.*;

public class searchelementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arry = {5,3,6,1,2};
        int n = sc.nextInt();
        int count=0;
        for(int i:arry) {
        	if(n == i) {
        	System.out.println("element is present");
        	System.out.println();
        	count++;
        	break;
        	
        }
        }
        if(count==0){
        	System.out.println("element is not preasent");
        	
        }

	}

}

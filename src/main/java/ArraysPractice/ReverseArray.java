package ArraysPractice;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arry = new int[n];
		for(int i=0;i<n;i++) {
			arry[i]=sc.nextInt();
		}
		
		//using swaping
		int start =0;
		int end = arry.length-1;
		for(int i =0;i<n;i++) {
			int tem = arry[start];
			arry[start]=arry[end];
			arry[end]=tem;
		}
		for(int i : arry) {
			System.out.println(i);
		}
		//using another array
		int[] rarry = new int[n];
		for(int i=0;i<rarry.length;i++) {
			rarry[i] = arry[arry.length-1-i];
		}
		for(int i : arry) {
			System.out.println(i);
		}
		//using list and collections
        Collections.reverse(Arrays.asList(arry));
        System.out.println(Arrays.toString(arry));
		
	}

}

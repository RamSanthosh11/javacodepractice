package ArraysPractice;
import java.util.*;
public class MinandMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = {5,3,6,1,2};
		int minn =arry[0];
		int max = arry[0];
		for(int i :arry) {
			if(i>max) {
				max=i;
			}
			else {
				minn=i;
				
			}
			
		}
		System.out.println(minn);
		System.out.println(max);

	}

}

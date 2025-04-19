package stringinterviewpractice;
import java.util.*;

public class ReverseEachWord {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String [] str1 = str.split(" ");
	String rev ="";
	for(int i=0;i<str1.length;i++) {
		String tem = str1[i];
		String reveserword ="";
		for(int j =tem.length()-1;j>=0;j--) {
			reveserword = reveserword+tem.charAt(j);
			
		}
		rev = rev+reveserword+" ";
		
	}
	System.out.println(rev);
	

}
}

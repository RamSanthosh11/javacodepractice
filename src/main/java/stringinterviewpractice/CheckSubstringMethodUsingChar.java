package stringinterviewpractice;
import java.util.*;

public class CheckSubstringMethodUsingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine().toLowerCase();
        String second = sc.nextLine().toLowerCase();
        boolean found = false;
        
        for(int i =0;i<=first.length() -second.length();i++){
            int j;
            for(j=0;j<second.length();j++){
                if(first.charAt(i+j)!=second.charAt(j)){
                    break;
                }
                
            }
            if(j == second.length()){
                found = true;
                break;
            }
            }
        if(found){
            System.out.println("Substrings");
        }
        else{
            System.out.println("Both are not substring");
        }

	}

}

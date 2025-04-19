package stringinterviewpractice;
import java.util.*;

public class ReveseSentenceWithoutWordReverse {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        
        String[] words = str1.split(" ");
        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}

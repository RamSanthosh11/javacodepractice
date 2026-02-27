package ListsPractice;
import java.util.*;

public class ReverseAList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int inputEle = sc.nextInt();
            arr.add(inputEle);
        }
        Collections.reverse(arr);
        System.out.println("Reversed List: " + arr);
    }
}
package ListsPractice;
import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter number of elements of List1: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of list1:");
        for (int i = 0; i < n; i++) {
            int inputEle = sc.nextInt();
            arr.add(inputEle);
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.print("Enter number of elements of List2: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of list2:");
        for (int i = 0; i < n1; i++) {
            int inputEle = sc.nextInt();
            arr1.add(inputEle);
        }
        arr.addAll(arr1);
        System.out.println("Reversed List: " + arr);
    }
}
package ArraysPractice;

public class OrderArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,8,3,7,9,1};
		for (int i=0;i<array.length-1;i++) {
			for(int j=i ;j<array.length-1-i;j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
				
			}
		}
		for(int i :array) {
			System.out.println(i);
		}

	}

}

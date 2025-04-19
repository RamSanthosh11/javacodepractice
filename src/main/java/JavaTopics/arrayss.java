package JavaTopics;

import java.util.Scanner;

public class arrayss {
	
    public static void main(String[] args) {
    	
    	/*
    	int[] array = {1,2,3,4,5};
    	for (int i =0;i<array.length;i++) {
    		System.out.println(array[i]);
    
    	}
    	*/
    	//taking array inputs from user 
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] array = new int[n];
    	for(int i=0;i<n;i++) {
    		array[i]=sc.nextInt();
    	}
    	//printing the array elements
    	for (int i =0;i<array.length;i++) {
    		System.out.println(array[i]);
    
    	}
    	
    	int[][] multiarray = {
    			{1,2,3,4},
    			{5,6,7,8,9},
    			{10,11,12,3}
    			};
    	for (int i =0;i<multiarray.length;i++) {
    		for(int j=0;j<multiarray[i].length;j++) {
    		System.out.print(multiarray[i][j]);
    	}
    		 System.out.println();
    	}
    	
    	
    	
    }
    

}

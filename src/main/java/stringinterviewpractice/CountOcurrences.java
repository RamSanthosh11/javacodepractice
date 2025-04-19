package stringinterviewpractice;
import java.util.*;
public class CountOcurrences {
	  public static void main(String[] args) {
	        System.out.println("Try programiz.pro");
	        String str = "rammam";
	        String str1 =" ";
	        for(int i =0;i<str.length();i++){
	            if(str1.indexOf(str.charAt(i))==-1){
		        str1=str1+str.charAt(i);
	            int count =0;
	            for(int j=i;j<str.length();j++){
	                if(str.charAt(i)==str.charAt(j)){
	                    count++;
	                }   
	            }
	            System.out.println(str.charAt(i)+" count is "+count);
	            }
	        }
	    }
	}
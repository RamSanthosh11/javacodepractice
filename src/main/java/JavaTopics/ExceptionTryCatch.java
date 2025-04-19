package JavaTopics;

public class ExceptionTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=7;
		int c=0;
		int arr[] = new int[5];
		try
		{
			System.out.println(arr[7]);
		}
		catch(ArrayIndexOutOfBoundsException ets) {
			System.out.println("I catched index out of bound exception");
		}
		catch(ArithmeticException et) {
			System.out.println("I catched the arthimetic exceptions");
		}
		catch(Exception e) {
			
			System.out.println("I have found exception");
		}
		finally {
			System.out.println("Delete Cookiesb");
		}
	}

}

package Exception_handling;
public class Multiplecatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
        try {
        	int a[]= {3,4,2,1,5};
        	a[i]=100/0;
        	
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
        }
        catch(ArithmeticException e) {
        	System.out.println(e);
        }
       
	}

}


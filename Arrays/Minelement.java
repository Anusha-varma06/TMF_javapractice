package Arrays;

public class Minelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,72,28,9,40,32};
        int min=a[0];
        for(int i=1;i<a.length;i++) {
        	if(a[i]<min) {
        		min=a[i];
        	}
        }
        System.out.println("The minimum of all elements in an array:"+min);
	}

}

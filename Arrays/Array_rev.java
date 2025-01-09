package Arrays;
public class Array_rev {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,3,5,7,11,13};
        for(int x:arr) {
        	System.out.print(x);
        	System.out.print(" ");
        }
        System.out.println();
        //reversing an array
        System.out.println("After reversing an array:");
        for(int i=arr.length-1;i>=0;i--) {
        	System.out.print(arr[i]+" ");
        }
	}

}

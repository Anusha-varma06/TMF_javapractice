package Arrays;
public class Right_rotation {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		         int arr[]= {2,5,3,7,6};
		         int temp=arr[arr.length-1];
		         for(int i=arr.length-1;i>0;i--) {
		        	 arr[i]=arr[i-1];
		         }
		         arr[0]=temp;
		         for(int x:arr) {
		        	 System.out.print(x+" ");
		         }
			}

		}

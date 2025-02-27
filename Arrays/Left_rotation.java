package Arrays;
public class Left_rotation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
		         int arr[]= {2,5,3,7,6};
		         int temp=arr[0];
		         for(int i=0;i<arr.length-1;i++) {
		        	 arr[i]=arr[i+1];
		         }
		         arr[arr.length-1]=temp;
		         for(int x:arr) {
		        	 System.out.print(x+" "); 
		         }
		         
			}

		}
	



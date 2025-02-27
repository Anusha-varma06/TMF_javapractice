package Arrays;
public class Unique_elements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int arr[]= {7,3,7,4,3,7,2};
		        int count=0;
		        System.out.println("The unique elements are:");
		        for(int i=0;i<arr.length;i++) {
		        	if(arr[i]!=-1) {
		        		for(int j=0;j<arr.length;j++) {
		        			if(i!=j) {
		        				if(arr[i]==arr[j]) {
		        					count++;
		        					arr[j]=-1;
		        				}
		        		}
		        			
		        	}
		        		if(count==0) {
		        			System.out.println(arr[i]);
		        		}
		        		count=0;
		        }
		      }
			}
}



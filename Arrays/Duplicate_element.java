package Arrays;
public class Duplicate_element {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,2,6,2,6,7};
		int count=0;
		System.out.println("The duplicate elements are:");
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]!=-1) {
        		 for(int j=0;j<arr.length;j++) {
            		 if(i!=j) {
            			 if(arr[i]==arr[j]) {  
            					 arr[j]=-1;
            					 count++;
            					 if(count<=1) {
                    				 System.out.print(arr[i]+" ");
                    			   }
            				 } 
            			 }
            		 }
        		 count=0;
        	     }
        	 }
         }
	}



package Tmf_Assignment01;
public class Binarysearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		        int target = 7; 
		        int left = 0;
		        int right = array.length - 1;
		        int result = -1;
		            while (left <= right) {
		            // Calculate middle index
		            int mid = left + (right - left) / 2;

		            // Check if target is at the middle
		            if (array[mid] == target) {
		                result = mid;
		                break;  
		            }
		            // If target is smaller, search the left half
		            else if (array[mid] > target) {
		                right = mid - 1;
		            }
		            // If target is larger, search the right half
		            else {
		                left = mid + 1;
		            }
		        }

		        // Output the result
		        if (result == -1) {
		            System.out.println("Element not found.");
		        } else {
		            System.out.println("Element found at index: " + result);
		        }
		    }
		}

	



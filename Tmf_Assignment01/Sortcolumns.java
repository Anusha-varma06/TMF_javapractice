package Tmf_Assignment01;
import java.util.Arrays;
public class Sortcolumns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[][] array = {
		            {3, 1, 4},
		            {2, 5, 7},
		            {8, 6, 9}
		        };
		        System.out.println("Original 2D Array:");
		        for (int i = 0; i < array.length; i++) {
		            for (int j = 0; j < array[i].length; j++) {
		                System.out.print(array[i][j] + " ");
		            }
		            System.out.println();
		        }
		        int rows = array.length;
		        int cols = array[0].length;
		        for (int col = 0; col < cols; col++) {
		            int[] temp = new int[rows];
		            for (int row = 0; row < rows; row++) {
		                temp[row] = array[row][col];
		            }
		            Arrays.sort(temp);
		            for (int row = 0; row < rows; row++) {
		                array[row][col] = temp[row];
		            }
		        }
		        System.out.println("\nSorted 2D Array across columns:");
		        for (int i = 0; i < array.length; i++) {
		            for (int j = 0; j < array[i].length; j++) {
		                System.out.print(array[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}



package Tmf_Assignment01;
public class Transpose {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int org[][]= {{2,4},{6,8}};
        int trans[][]=new int[2][2];
        System.out.println("Matrix without transpose:");
        for(int i=0;i<2;i++) {
        	for(int j=0;j<2;j++) {
        		System.out.print(org[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("Matrix after transpose");
        for(int i=0;i<2;i++) {
        	for(int j=0;j<2;j++) {
        		trans[i][j]=org[j][i];
        		System.out.print(trans[i][j]+" ");
        	}
        	System.out.println();
        }
        
	}

}

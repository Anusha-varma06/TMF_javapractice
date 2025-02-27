package Tmf_Assignment01;
public class Addmatrices {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]= {{3,4,7},{7,2,5},{4,1,8}};
        int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int c[][]= new int[3][3];
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++){
        		c[i][j]=a[i][j]+b[i][j];
        		System.out.print(c[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}

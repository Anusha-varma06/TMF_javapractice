package Tmf_Assignment01;
public class Matricesequal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]= {{5,4},{7,6}};
        int b[][]= {{5,4},{7,6}};
        int count=0;
        if(a.length==b.length&&a[0].length==b[0].length) {
        	for(int i=0;i<2;i++) {
        		for(int j=0;j<2;j++) {
        			if(a[i][j]==b[i][j]) {
        				count++;
        			}
        		}
        	}
        	if(count==a.length*a[0].length) {
        		System.out.println("Both the matrices are equal");
        	}
        	else {
        		System.out.println("Both the matrices are not equal");
        	}
        }
        else {
        	System.out.println("The matrices are of different sizes");
        }
	}

}

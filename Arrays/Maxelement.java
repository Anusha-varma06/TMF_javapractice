package Arrays;
public class Maxelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {12,72,28,22,40,32};
        int max=a[0];
        for(int i=1;i<a.length;i++) {
        	if(a[i]>max) {
        		max=a[i];
        	}
        }
        System.out.println("The maximum of all elemts in an array:"+max);
	}

}

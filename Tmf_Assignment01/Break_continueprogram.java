package Tmf_Assignment01;
public class Break_continueprogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //printing the numbers until the given condition is reached
		System.out.println("Using break statement");
		for(int i=1;i<=5;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		//printing the numbers by skipping the number based on given condition
		System.out.println("Using continue statement");
		for(int i=1;i<=5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
	}

}

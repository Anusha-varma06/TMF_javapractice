package Exception_handling;
public class Throw_usage {
	static void validation(int n) {
		if(n<0) {
			throw new ArithmeticException("negative number-Invalid");
		}
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
        try {
        	validation(-1);
        }
        catch(ArithmeticException e) {
        	System.out.println(e);
        }
        System.out.println("welcome to exception handling concept");
	}

}

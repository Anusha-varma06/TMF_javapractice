package Exception_handling;
public class Throws_usage {
	public static void agechecking(int n)throws Exception {
		if(n<=20) {
			throw new Exception("Not eligible");
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			agechecking(17);
		}
        catch(Exception e){
        	System.out.println(e.getMessage());
        }
        System.out.println("welcome");
	}

}


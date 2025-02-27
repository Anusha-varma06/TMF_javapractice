package Exception_handling;
class voting extends Exception{
	voting(String s){
		super(s);
	}
}
public class Custom_exception {
	public static void validation(int n) throws voting {
		if(n<18) {
			throw new voting("Not eligible for voting");
		}
		else {
			System.out.println("eligible for voting");
		}
	}
	public static void main(String[] args) throws voting {
		// TODO Auto-generated method stub
      try {
    	  validation(17);
      }
      catch(voting e) {
    	  System.out.println(e);
      }
	}

}


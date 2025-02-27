package Tmf_Assignment01;
public class Replacing_words {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="rose";
        String s1=s.replace('r', 'b');
        System.out.println("After replacing using replace method:"+s1);
        String s2=s.replaceAll("se", "ad");
        System.out.println("After replacing using replaceAll method:"+s2);
	}

}

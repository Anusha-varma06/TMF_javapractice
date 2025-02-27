package Tmf_Assignment01;
import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Ramu";
        String str2 = "umar";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Check if the strings have the same length
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        else{
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
	}

}

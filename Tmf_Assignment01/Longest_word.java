package Tmf_Assignment01;
public class Longest_word {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Mahakhumbmela happening in 2025 after 144 years";
        String arr[]=str.split(" ");
        String longest="";
        for(String word:arr) {
        	if(word.length()>longest.length()) {
        		longest=word;
        	}
        }
        System.out.println("The longest word in the string:"+longest);
	}

}

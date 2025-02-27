package Tmf_Assignment01;
public class Duplicatewords_string {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Scuby dooby Do scuby do";
         String arr[]=str.split(" ");
         boolean ispresent=false;
         System.out.println("The duplicate words are:");
         for(int i=0;i<arr.length;i++) {
        	 for(int j=i+1;j<arr.length;j++) {
        		 if(arr[i].equalsIgnoreCase(arr[j])) {
        			 System.out.println(arr[i]);
        			 ispresent=true;
        			 break;
        		 }
        	 }
         }
         if(!ispresent) {
        	 System.out.println("There are no duplicate words");
         }
	}

}

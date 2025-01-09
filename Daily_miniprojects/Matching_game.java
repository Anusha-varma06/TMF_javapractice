package Daily_miniprojects;
import java.util.*;
public class Matching_game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int st,cap;
         System.out.println("-----WELCOME TO MINI MATCHING CONTEST-----");
         System.out.println("States & Capitals");
         System.out.println("Column-A               Column-B");
         System.out.println("a.Andhrapradesh        1.Jaipur");
         System.out.println("b.Tripura              2.Telangana");
         System.out.println("c.Rajasthan            3.Amaravathi");
         System.out.println("d.Hyderabad            4.Mumbai");
         System.out.println("e.Maharastra           5.Agartala");
         System.out.println("Match the states and capitals one by one");
         for(int i=1;i<=5;i++) {
        	 System.out.println("Enter the state:");
        	 st=sc.next().charAt(0);
        	 System.out.println("Enter the capital:");
        	 cap=sc.nextInt();
        	 if(st=='a'&&cap==3) {
        		 sum=sum+1;
        	 }
        	 else if(st=='b'&&cap==5) {
        		 sum=sum+1;
        	 }
        	 else if(st=='c'&&cap==1){
        		 sum=sum+1;
        	 }
        	 else if(st=='d'&&cap==2) {
        		 sum=sum+1;
        	 }
        	 else if(st=='e'&&cap==4) {
        		 sum=sum+1;
        	 }
        	 else {
        		 
        	 }
        	 
         }
         System.out.println("Your total score is:"+sum);
	}

}

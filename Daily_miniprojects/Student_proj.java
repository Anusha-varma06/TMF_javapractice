package Daily_miniprojects;
import java.util.Scanner;
public class Student_proj {
	int id;
	String name;
	int math;
	int sci;
	int his;
	void assignInfo(int id,String name,int math,int sci,int his)
	{
		this.id=id;
		this.name=name;
		this.math=math;
		this.sci=sci;
		this.his=his;
	}
	void totalDisplay() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student_proj ob[]=new Student_proj[3];
		System.out.println("Welcome to XYZ School");
		System.out.println("Do you want to upload your student marks details(y/n):");
		char ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y') {
		for(int i=0;i<ob.length;i++) {
			    ob[i]=new Student_proj();
				System.out.println("Enter Student_id:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter student_name:");
				String name=sc.nextLine();
				System.out.println("Enter your Math_marks:");
				int math=sc.nextInt();
				System.out.println("Enter your Science_marks:");
				int sci=sc.nextInt();
				System.out.println("Enter your History_marks:");
				int his=sc.nextInt();
				ob[i].assignInfo(id, name,math,sci,his);
			}
			
		}
		
		
	}

}

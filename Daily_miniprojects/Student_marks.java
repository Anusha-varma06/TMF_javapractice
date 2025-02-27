package Daily_miniprojects;
import java.util.Scanner;
public class Student_marks {
	int id;
	String name;
	int salary;
	void assignInfo(int id,String name,int sal) {
		this.id=id;
		this.name=name;
		salary=sal;
	}
	@Override public String toString() {
		return id+" "+name+" "+salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		Student_marks ob[]=new Student_marks[3];
		for(int i=0;i<ob.length;i++) {
			ob[i]=new Student_marks();
			System.out.println("Enter Student_id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter student_name:");
			String name=sc.nextLine();
			ob[i].assignInfo(id, name,20000);
		}
		for(int j=0;j<ob.length;j++) {
			System.out.println( ob[j]);
			//System.out.println(ob[j].name);
			sum=sum+ob[j].salary;
			
		}
		System.out.println("sum of the salaries"+sum);
		
	}

}

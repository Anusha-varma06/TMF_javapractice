package Daily_miniprojects;
import java.util.Scanner;
class GymMembership{
String member_name;
String membership;
int duration;
GymMembership(String member_name,String membership,int duration){
this.member_name=member_name;
this.membership=membership;
this.duration=duration;
}

void membership_fee() {

int standard_cost=1000;

int fee=duration*standard_cost;

System.out.println("The membership fee for the standard membership is:"+fee);

}
void specialoffer() {
	if(duration>10) {
		System.out.println("you got an offer of 10% discount");
	}
}

}

public class PremiumMembership extends GymMembership {
boolean personal_trainer;
boolean spa_access;
PremiumMembership(String member_name,String membership,int duration,boolean personal_trainer,boolean spa_access){
super(member_name,membership,duration);
this.personal_trainer=personal_trainer;
this.spa_access=spa_access;
}
void membership_fee() {
if(personal_trainer==true&& spa_access==true) {
System.out.println("Total fee is:"+(duration*1000+500));
}
else if(personal_trainer==false&& spa_access==true) {
System.out.println("Total fee is:"+(duration*1000+200));
}
else if(personal_trainer==true&& spa_access==false){
System.out.println("Total fee is:"+(duration*1000+300));
}
else {
super.membership_fee();
}
}
void specialoffer() {
	System.out.println("The available offers:");
	if(membership.equals("premium")) {
		if(duration>10) {
			System.out.println("you got an offer of 15% discount");
		}
		else {
			System.out.println("No offers for now");
		}
	}
	else {
		super.specialoffer();
	}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
String name=sc.nextLine();
System.out.println("Enter the membership type (standard/premium):");
String membership_type=sc.nextLine();
System.out.println("Enter the duration in months");
int dur=sc.nextInt();
if(membership_type.equals("premium")) {
	System.out.println("Do you require any personal trainer:");
	boolean personal=sc.nextBoolean();
	System.out.println("Do you require any spa_access");
	boolean spa=sc.nextBoolean();
	PremiumMembership obj=new PremiumMembership(name,membership_type,dur,personal,spa);
	obj.membership_fee();
	obj.specialoffer();
}
else {
	PremiumMembership obj=new PremiumMembership(name,membership_type,dur,false,false);
	obj.membership_fee();
	obj.specialoffer();
	
}

}

}



package Collections_practise;
import java.util.*;
class employee{
	String name;
	int id;
	employee(String nm,int id){
		name=nm;
		this.id=id;
	}
}
public class Array_listobject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<employee> obj=new ArrayList<employee>();
        employee e1=new employee("gukesh",102);
        employee e2=new employee("mukesh",104);
        obj.add(e1);
        obj.add(e2);
//        for(employee p:obj) {
//        	System.out.println(p.name+" "+p.id);
//        }
        Iterator i=obj.iterator();
        while(i.hasNext()) {
        	employee e=(employee)i.next();
        	System.out.println(e.id+" "+e.name);
        }
        System.out.println("After removing");
         //obj.remove(e1);
         employee ee=obj.get(0);
         ee.name="";
         obj.set(0, ee);
//        ee.remove()
     
        for(employee p:obj) {
      	System.out.println(p.name+" "+p.id);
        }
	}

}

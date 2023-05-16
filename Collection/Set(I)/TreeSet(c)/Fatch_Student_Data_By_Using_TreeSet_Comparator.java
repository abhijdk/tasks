

/*
 Create a Student class with the following elements:

	* Instance variables: int sID and String sName.
	* A parameterized constructor.
	* A toString method.
	 
	Create another class Order_Stunet
	that class implements from Comparator
	
	Create another class Fatch_Student_Data_By_Using_TreeSet_Comparator
	(for Testing) with a main method. 
	In the main method, use a TreeSet to store the student details. 
	Fetch the data using a foreach loop with a lambda expression.
 */
import java.util.*;

class My_Student  {
	int sId;
	String sName;
	protected My_Student(int sId, String string) {
		super();
		this.sId = sId;
		this.sName = string;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}	
}
class Order_Stuent implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.sName.compareTo(o2.sName);
	}
	
}
public class Fatch_Student_Data_By_Using_TreeSet_Comparator {
	public static void main(String[] args) {
		Set<Student> ts=new TreeSet<Student>(new Order_Stuent());
		ts.add(new Student(111, "RaviSir"));
		ts.add(new Student(222, "HKSir"));
		ts.forEach(x->System.out.println(x));
	}
}

/*
 	In the above code, 
 	the Student class has instance variables sID and sName, 
 	a parameterized constructor, and a toString method to represent the student details.

	The OrderStudent class implements the Comparator interface and provides a compare
	 method to order the students based on their names.

	The FetchStudentDataByUsingTreeSetComparator class contains the main method where 
	a TreeSet is created with the OrderStudent comparator to store the student details. 
	Three Student objects are added to the set. Finally, a forEach loop with a lambda 
	expression is used to fetch and print the data of each student in the set.

 */


/*
 	Create a Student class with the following elements:

	* Instance variables: int sID and String sName.
	* A parameterized constructor.
	* A toString method.
	 
	Create another class My_TreeSet_Comparable (for Testing)
	with a main method. 
	In the main method, use a TreeSet to store the student details. 
	Fetch the data using a foreach loop with a lambda expression.
 */
import java.util.*;

class Student implements Comparable<Student> {
	int sId;
	String sName;
	protected Student(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
//	public int compareTo(Student s) 
//	{
//		 // Compare based on student ID
//		return this.sId-s.sId;
//	}
	public int compareTo(Student s)  
	{
//		 // Compare based on student NAME
		return this.sName.compareTo(s.sName);
	}
}

public class Fatch_Student_Data_By_Using_TreeSet {
	public static void main(String[] args) {
		Set< Student> ts=new TreeSet<Student>();
		 // Adding students to the set
		ts.add(new Student(101, "JAGA"));
		ts.add(new Student(101, "MANOJ"));
		ts.add(new Student(101, "DEPAK"));
		ts.add(new Student(101, "SAMBHU"));
		ts.add(new Student(102, "MANAS"));
		
		// Fetching and printing the student details using a foreach loop with lambda
	    ts.forEach(x->System.out.println(x));
	}
}

/*
 	There's a Student class with instance variables sID and sName. 
 	It includes a parameterized constructor to initialize these 
 	variables and an overridden toString method to provide a string 
 	representation of a Student object. The Student class also 
 	implements the Comparable interface to define the natural o
 	rdering based on the student ID (or) student NAME.

	The My_TreeSet_Comparable class (for testing) contains the main method.
	 Inside the main method, a TreeSet named studentSet is created to store 
	 Student objects. Students are added to the set, and then the student 
	 details are fetched and printed using a foreach loop with a lambda expression.
*/

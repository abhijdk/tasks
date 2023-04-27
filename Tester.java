

/*=====================================Question========================================
 * Write a java program to copy a set to another.
 * A SetCopy class is given to you. Add the following implementations in the class:
 * 1. Implement the method copySets(source, destination):
 * 2. The source and destination are two Sets of Integers. 
 * 		You have to copy all the elements in the source to the destination. 
 * 			Return 0 on successful copy
 * 3. If either the destination Set or source Set is null, return 1.
 * A class called Tester with the main method is given to you. Use this class to test your solution.
 */


/*======================================= Description ========================================
*This Java program implements a SetCopy class with a static method called copySets() that takes in
* two sets, source and destination. The method copies all the elements from the source set to the 
* destination set and returns 0 if the copy was successful, and 1 otherwise (if either the source 
* or destination set is null).

 * The Tester class is used to test the implementation of the copySets() method. In the main method, 
 * the program creates a source set with three elements and an empty destination set. It calls the 
 * copySets() method, passing in the source and destination sets as arguments, and stores the return 
 * value in the result variable. Then it prints the result and the contents of the destination set 
 * after the copy.

 * The program repeats the same process with a null source set and a non-null destination set, to test
 *  the case where the source set is null.

 * Overall, this program demonstrates how to copy the elements of one set to another using the addAll() method,
 *  and how to handle the case where one of the sets is null. 
*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class SetCopy {
	public static int copySets(Set<Object> source,Set<Object> destination)
	{
		if(source==null||destination==null)
			return 1;
		destination.addAll(source);
		return 0;
	}   
}
public class Tester {
	public static void main(String[] args) {
		
		
		Set<Object> source= new HashSet<Object> ();
		source.add(1);
		source.add(2);
		source.add(3);
		
		Set<Object> destination=new HashSet<Object> ();
		int result=SetCopy.copySets(source, destination);
		
		System.out.println("Result  = " + result);
		System.out.println("Destination set after copy: " + destination.toString()+"\n");
		
		System.out.println("=====================================");
		
		Set<Object> source1=null;
		
		Set<Object> destination1=new HashSet<Object> ();
		int result1=SetCopy.copySets(source, destination);
		
		System.out.println("Result  = " + result1);
		System.out.println("Destination set after copy: " + destination1.toString()+"\n");
	}
}
//		OutPut
//Result  = 0
//Destination set after copy: [1, 2, 3]
//
//=====================================
//Result  = 0
//Destination set after copy: []
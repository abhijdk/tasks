
/*
 * =================================Question==================================
 * Write a java program by taking integer element in ArrayList & remove the 
 * even element from the ArrayList?
 * Input as: [70,60,45,30,55,77,44]
 * Output as: [45,55,77]
 */

/*
 * =================================Solution==================================
 * In this program, we create an ArrayList of integers and add the input elements to it.
 *  We then loop through the ArrayList and use the modulus operator to check if an element 
 *  is even. If it is, we remove it from the ArrayList using the remove() method and 
 *  decrement the loop counter to avoid skipping over the next element. 
 *  Finally, we print out the ArrayList after removing the even elements.
 */
import java.util.ArrayList;
import java.util.Iterator;
public class RemovingTheEvenElementsFromArrayList {
	public static void main(String[] args){
		ArrayList<Integer> al=new ArrayList<Integer>();
//		70,60,45,30,55,77,44
		al.add(70);
		al.add(60);
		al.add(45);
		al.add(30);
		al.add(55);
		al.add(77);
		al.add(44);
		
		System.out.println("All added Element's" +al);
		
//		Below Logic for show only odd output
//		for(int x:al){
//			if(x%2!=0)
//				System.out.println(x);
//		}
		for(int i=0;i<al.size();i++){
			if (al.get(i)%2==0){ //checking even elements
				al.remove(i); //removing the  elements
				--i;// one index position back
			}
		}
		System.out.println("After removing even element"+al);
	}
}

//=================Output======================
//All added Element's[70, 60, 45, 30, 55, 77, 44]
//After removing even element[45, 55, 77]


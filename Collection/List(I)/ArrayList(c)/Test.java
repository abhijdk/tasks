
import java.util.*;
import java.util.function.*;


/*
 * =============================Question========================================
 * We have two classes named as FindStudent and Test
 * For FindStudent class
 * Instance Variables:
 * name: String
 * id: int
 * Methods:
 * Two parameterized constructor
 * FindStudent(String, int) : initialize instance variables
 * getName(): String
 * getId() : int
 * toString() : @Override
 * For class Test
 * This class contains main method to test all the solutions for classes and methods and add() method
 * for main method
 * Local variable:
 * studenList : List< FindStudent >
 * result: List<FindStudent>
 * print result
 * for add() method
 * add(List, Predicate): List< FindStudent >: public: static
 * Local variable:
 * newList :  List< FindStudent >
 * By using for each if pradicate.test of student so, add the elements to newList then return newList
 */


class FindStudent {
    private String name;
    private int id;
  
    public FindStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }
  
    public String getName() {
        return name;
    }
  
    public int getId() {
        return id;
    }
  
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

public class Test {
    public static void main(String[] args) {
        List<FindStudent> sList = new ArrayList<>();

        sList.add(new FindStudent("Ravi", 1));
        sList.add(new FindStudent("Prasanta", 2));
        sList.add(new FindStudent("HK", 3));
        sList.add(new FindStudent("Amresh", 4));

        List<FindStudent> result = add(sList, student -> student.getId() % 1 == 0);

        for (FindStudent student : result) {
            System.out.println(student);
        }
    }

//    Predicate<Integer> p=ids->ids>18;
//	System.out.println(p.test(11));
	
    public static List<FindStudent> add(List<FindStudent> studentList, Predicate<FindStudent> predicate) {
        List<FindStudent> newList = new ArrayList<>();

        for (FindStudent student : studentList) {
            if (predicate.test(student)) {
                newList.add(student);
            }
        }

        return newList;
    }
}



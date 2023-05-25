package may_25_2023;

/*
We have one class named as StudentRegister
Instance variables: 
No Instance Variables
Static variables:
hashmap: HashMap: static: public
Methods:
Default Constructor
registerStudent(String, int): void: static: public
if hashmap does not contains key so, put the id and value into hashmap
else it prints "Student already Registred"
This class having main method to test all the methods in this class
In Main method by using Object
fun : Function<Integer , String> 
	if hashmap contains key then return key or else return "Key is not Valid"
Print student name by using Function apply method
 */
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class StudentRegister_Using_HashMap {
    private static Map<Integer, String> hashmap = new HashMap<>();

    public static void registerStudent(String name, int id) {
        if (!hashmap.containsKey(id)) {
            hashmap.put(id, name);
        } else {
            System.out.println("Student already registered");
        }
    }

    public static void main(String[] args) {
        StudentRegister_Using_HashMap.registerStudent("Jaga", 101);
        StudentRegister_Using_HashMap.registerStudent("Kalia", 102);
        StudentRegister_Using_HashMap.registerStudent("Depak", 103);
        StudentRegister_Using_HashMap.registerStudent("Manoj", 102); // Already registered

        Function<Integer, String> fun = key -> hashmap.containsKey(key) ? hashmap.get(key) : "Key is not valid";
        System.out.println("Student Name: " + fun.apply(101)); // Charlie
        System.out.println("Student Name: " + fun.apply(105)); // Key is not valid
    }
}

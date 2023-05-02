
import java.io.*;
import java.util.*;

public class Person_RetrieveObject {
    public static void main(String[] args) {
        try {
        	FileInputStream fis=new FileInputStream("D:\\Person.txt");
        	ObjectInputStream ois=new ObjectInputStream(fis);
        	ArrayList<Person_Class> al= (ArrayList<Person_Class>) ois.readObject();
        	fis.close();
        	ois.close();
        	System.out.println(al.toString());
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}









//public class Person_RetrieveObject {
//    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("D:\\Person.txt");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            HashSet<Person_Class> person = (HashSet<Person_Class>) ois.readObject();
//            ois.close();
//            fis.close();
//            for (Person_Class p : person) {
//                System.out.println(p.toString());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } 
//    }
//}

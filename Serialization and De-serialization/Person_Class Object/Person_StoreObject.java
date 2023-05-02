
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Person_StoreObject 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of person: ");
		int num=sc.nextInt();
		ArrayList<Person_Class> al=new ArrayList<Person_Class>();
		for(int i=0;i<num;i++)
		{
			Person_Class p=Person_Class.getPersonObject();
			al.add(p);
		}
//		System.out.println(al);
		try {
			FileOutputStream fis=new FileOutputStream("D:\\Person.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fis);
			oos.writeObject(al);
			fis.close();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File save success fully");
	}
}

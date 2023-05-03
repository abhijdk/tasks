
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MyCustomerComparator
{
	public static void main(String[] args) 
	{
		ArrayList<MyCustomer> al =new ArrayList<MyCustomer>();
		al.add(new MyCustomer(101, "Jaga", 310000.00));
		al.add(new MyCustomer(102, "Manoj", 350000.00));
		al.add(new MyCustomer(103, "Depak", 305000.00));
		al.add(new MyCustomer(104, "Manas", 390000.00));
		
//		****Based on MyCustomer Id number****
		System.out.println("Based on MyCustomer Id number");
		
//		Using Anonymous class
//		Comparator <MyCustomer> custId= new Comparator<MyCustomer>()
//		{
//			public int compare(MyCustomer c1, MyCustomer c2)
//			{
//				//Sorting logic on the basis of customer did
//				return c1.getcId()-c2.getcId();
//			}
//		};
//		Collections.sort(al, custId);

//		Using Lambda
		Comparator<MyCustomer> custId=(c1,c2)->c1.getcId()-c2.getcId();
		Collections.sort(al,custId);
//		al.forEach(cust->System.out.println(cust));
		al.forEach(System.out::println);
		
//		***Based on MyCustomer name***
		System.out.println("Based on MyCustomer name");
		
		Comparator<MyCustomer> custName=(c1,c2)->c1.getcName().compareTo(c2.getcName());
		Collections.sort(al,custName);
		al.forEach(System.out::println);
	}
	
}

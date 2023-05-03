//DesendingOrder.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DesendingOrder 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(500);
		al.add(51);
		al.add(5540);
		al.add(40);
		al.add(10);
		al.add(5010);
		al.add(1500);
		al.add(5800);
		al.add(1);
		
//		Collections.sort(al);

//		Using Anonymous class
				Comparator<Integer> c=new Comparator<Integer>() 
				{
					public int compare(Integer i1,Integer i2)
					{
						return i2-i1;
					}
				};
				Collections.sort(al,c);
				al.forEach(System.out::println);
				
//		Using Lambda
//		Comparator <Integer> desc=(c1, c2)->-(c1-c2);
//		Collections.sort(al, desc);
		
//		al.forEach(data->System.out.println(data));
		al.forEach(System.out::println);
	}
}



















/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DesendingOrder 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(500);
		al.add(51);
		al.add(5540);
		al.add(40);
		al.add(10);
		al.add(5010);
		al.add(1500);
		al.add(5800);
		al.add(1);
		
//		Collections.sort(al);

//		Using Anonymous class
				Comparator <Integer> desc= new Comparator<Integer>()
				{
					public int compare(Integer c1, Integer c2)
					{
						//Sorting logic on descending order
						return c2-c1;
					}
				};
				Collections.sort(al, desc);

//		Using Lambda
//		Comparator <Integer> desc=(c1, c2)->-(c1-c2);
//		Collections.sort(al, desc);
		
		
		al.forEach(data->System.out.println(data));
	}
}
/**/

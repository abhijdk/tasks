package may_24_2023;

import java.util.Scanner;
import java.util.function.Predicate;

public class My_Pre_Fun1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String s=sc.next();
		Predicate<String> p=str-> str.contains("A");
		System.out.println("Name "+s+" contains A is: "+p.test(s));
	}
}

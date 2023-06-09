
import java.text.*;
import java.util.*;
import java.io.*;

public class Person_Class implements Serializable
{
	private Integer personId;
	private String personName;
	private String personAddress;
	private Date personDateOfBirth;
	protected Person_Class(Integer personId, String personName, String personAddress, Date personDateOfBirth) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAddress = personAddress;
		this.personDateOfBirth = personDateOfBirth;
	}
	
	
	protected Person_Class() {
		super();
	}


	public static Person_Class getPersonObject()
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.print("Enter  Person id: ");
		Integer personId=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Person Name: ");
		String personName=sc.nextLine();
		System.out.print("Enter Person Address: ");
		String personAddress=sc.nextLine();
		System.out.print("Enter Person DateOfBirth:(yyyy-mm-yy) ");
		String dob=sc.nextLine();
		Date personDateOfBirth=null;
		try {
			personDateOfBirth=new SimpleDateFormat("yyyy-mm-dd").parse(dob);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new Person_Class(personId,personName,personAddress,personDateOfBirth);
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress
				+ ", personDateOfBirth=" + personDateOfBirth + "]";
	}
	
	
}

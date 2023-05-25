package may_25_2023;

import java.util.function.Supplier;
//write a java program create a student class where instant vaiables are
//private int eNO;
//private String eName;
//private double eSalary;
//create a constructor
//then toString class

// again write a class  Lambda_Supplier_2 with main method
//here use Supplier interface and return the Student class Object
class Employe{
	private int eNO;
	private String eName;
	private double eSalary;
	protected Employe(int eNO, String eName, double eSalary) {
		super();
		this.eNO = eNO;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employe [NO=" + eNO + ", Name=" + eName + ", Salary=" + eSalary + "]";
	}
	
	
}
public class Lambda_Supplier_2 {
	public static void main(String[] args) {
		Supplier <Employe> mySpu=()-> new Employe(101, "OMM",2500);
		System.out.println(mySpu.get());
	}
}

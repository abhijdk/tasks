package hospital;

import java.util.*;

public class HospitalFinder 
{
	public static void main(String[] args) 
	{
		Hospital hospital1 = new Hospital("YASHODA", List.of("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro"), "RaviSir", "9848222222", "BBSR");
        Hospital hospital2 = new Hospital("Apollo", List.of("Cardiac", "Ortho", "Neuro", "Pediatric"), "PrasantSir", "9848333333", "HYDRABAD");
        System.out.println(hospital1);
        System.out.println(hospital2);
	}
}

package hospital;

import java.util.*;

public class HospitalService
{
	private ArrayList<Hospital> al=new ArrayList<>();

    public int addHospital(Hospital h)
    {
    	al.add(h);
        return h.getHospitalCode();
    }
    public Map getHospitals() 
    {
    	Map<Integer, String> map=new HashMap<>();
    	for (int i=0;i<al.size();i++) {
    		Hospital hs=al.get(i);
    		map.put(hs.getHospitalCode(), hs.getHospitalName());
    		
    	}
		return map;
    }
}

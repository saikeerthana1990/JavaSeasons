package oct9th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
	
		//List<String> hs=new ArrayList<String>();
		Set<String>  hs=new HashSet<String>();
		
		System.out.println("Size : "+hs.size());
		
		System.out.println(hs.add("Live Tech"));
		System.out.println(hs.add("Java"));
		System.out.println(hs.add("Selenium"));
		System.out.println(hs.add("TOSCA"));
		
		System.out.println("Size : "+hs.size());
		
		System.out.println(hs.add("Live Tech"));
		System.out.println(hs.add("Java"));
		System.out.println(hs.add("Selenium"));
		System.out.println(hs.add("TOSCA"));
		
		System.out.println("Size : "+hs.size());
		System.out.println(hs);
		
		

	}

}

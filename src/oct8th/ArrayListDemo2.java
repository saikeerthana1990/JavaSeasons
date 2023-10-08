package oct8th;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		System.out.println(al.size());
		
		al.add(100);
		//al.add(200.33);
		al.add(300);
		al.add(400);
		al.add(500);
		//al.add("Live Tech");
		System.out.println(al.size());
		al.add(100);
		//al.add(200.33);
		al.add(300);
		al.add(400);
		al.add(500);
		//al.add("Live Tech");
		System.out.println(al.size());
		
				
		/*
		 * System.out.println(al.get(0)); System.out.println(al.get(1));
		 * System.out.println(al.get(2)); System.out.println(al.get(3));
		 * System.out.println(al.get(4)); System.out.println(al.get(5));
		 */
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("using for-each loop");
		for(int temp:al)
		{
			System.out.println(temp);
		}

	}

}

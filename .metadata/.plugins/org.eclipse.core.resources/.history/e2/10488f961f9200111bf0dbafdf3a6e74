import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList<String> allCountries = new ArrayList<>();
		List<String> allCountries = new ArrayList<>();
		
		// CRUD
		
		// C - create/insert
		String str = "India";
		allCountries.add(str);
		allCountries.add("Nepal");
		allCountries.add("China");
		allCountries.add("Nepal");
		allCountries.add("Sri Lanka");
		
		System.out.println(allCountries);
		
		// R - read
		for(int i=0;i<allCountries.size();i++) {
			System.out.println(allCountries.get(i));
		}
		System.out.println("-------------");
		for(String eachCountry: allCountries) {
			System.out.println(eachCountry);
		}
		System.out.println("-------------");
		Iterator<String> itr = allCountries.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// U - Update
		allCountries.set(4, "SriLanka");
		System.out.println("-------------");
		for(String eachCountry: allCountries) {
			System.out.println(eachCountry);
		}
		
		// D - delete
		allCountries.remove("China");
		System.out.println("-------------");
		for(String eachCountry: allCountries) {
			System.out.println(eachCountry);
		}
		
	}

}

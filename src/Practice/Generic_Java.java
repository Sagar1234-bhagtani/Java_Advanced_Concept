package Practice;

import java.util.ArrayList;
import java.util.List;

public class Generic_Java {
	static <T> List<T> print_kra(T array[]) {
		List<T> mm=new ArrayList<>();
		for(T p:array) {
			mm.add(p);
		}
		return mm;
		
	}
	public static void main(String[] args) {
		Integer a[]= {1,2,3,4,5,6,8};
		String s[]= {"Mohan", "Sohan","Payal"};
		List<Integer> lll=print_kra(a);
		List<String> ll=print_kra(s);
		lll.forEach(r->System.out.println(r));
		ll.forEach(r->System.out.println(r));
		System.out.println("Trying for second Commit");
	}

}

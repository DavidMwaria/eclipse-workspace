import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BP_46_Union {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>(); // Create s1
		s1.add("Bill");
		s1.add("Larry");
		s1.add("Adolph");
		s1.add("Regina");
		s1.add("Susie");
		Set<String> s2 = new <String>HashSet(); // Create s2
		s2.add("Larry");
		s2.add("Jack");
		s2.add("Alice");
		s2.add("June");
		s2.add("Benny");
		s2.add("Susie");
		// Build the intersection set, s3
		Set<Object> s3 = new <Object>HashSet();
		Iterator iter1 = s1.iterator();
		Iterator iter2 = s2.iterator();
		while (iter1.hasNext()) {
			Object check = iter1.next();
			s3.add(check);
		}
		while (iter2.hasNext()) {
			Object check = iter2.next();
			s3.add(check);
		}
		// Print the intersection set
		Iterator iter3 = s3.iterator();
		while (iter3.hasNext()) {
			System.out.print(iter3.next() + " ");
		}
	}
}

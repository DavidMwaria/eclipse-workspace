import java.util.*;
public class BP_46_Intersection {
	public static void main(String[] args) {
		Set s1 = new HashSet(); // Create s1
		s1.add("Bill");
		s1.add("Larry");
		s1.add("Adolph");
		s1.add("Regina");
		s1.add("Susie");
		Set s2 = new HashSet(); // Create s2
		s2.add("Larry");
		s2.add("Jack");
		s2.add("Alice");
		s2.add("June");
		s2.add("Benny");
		s2.add("Susie");
		// Build the intersection set, s3
		Set s3 = new HashSet();
		Iterator iter1 = s1.iterator();
		while (iter1.hasNext()) {
			Object check = iter1.next();
			if (s2.contains(check)) {
				s3.add(check);
			}
		}
		// Print the intersection set
		Iterator iter3 = s3.iterator();
		while (iter3.hasNext()) {
			System.out.print(iter3.next() + " ");
		}
	}
}

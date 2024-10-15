package collection_FrameWork;

import java.util.HashSet;
import java.util.Set;

public class Vectore {

	public static void main(String[] args) {
//			Vector vctor = new Vector();
//			vctor.add("akshay");
//			vctor.add("kumar");
////			System.out.println(vctor.capacity());
////			System.out.println(vctor.elementAt(1));
//			vctor.trimToSize();
//	        System.out.println(vctor);
//	        Vector vctor1 = new Vector();
//	        vctor1.add("yadav");
//	        System.out.println(vctor.lastIndexOf("akshay"));
//	        System.out.println(vctor.clone());

		int g[] = { 2, 3, 5, 2, 5, 4, 6 };
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < g.length; i++) {
			if (s.add(g[i]) == false) {
				System.out.println("duplicate" + g[i]);
			}
		}
		System.out.println(s);
	}
}

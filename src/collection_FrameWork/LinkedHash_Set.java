package collection_FrameWork;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHash_Set {

	public static void main(String[] args) {
		LinkedHashSet linkhasSet = new LinkedHashSet();
		linkhasSet.add("A");
		linkhasSet.add("D");
		linkhasSet.add("C");
		System.out.println(linkhasSet.add("A"));
		System.out.println(linkhasSet);
		System.out.println(linkhasSet.add("z"));

	}
}

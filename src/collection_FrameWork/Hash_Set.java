package collection_FrameWork;

import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet hasset = new HashSet();
		hasset.add("A");
		hasset.add("D");
		hasset.add("C");
		System.out.println(hasset.add("A"));
		System.out.println(hasset);
		System.out.println(hasset.add("z"));

	}
}

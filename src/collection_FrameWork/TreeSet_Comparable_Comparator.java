package collection_FrameWork;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Comparable_Comparator implements Comparator {

	public static void main(String[] args) {
		TreeSet trset = new TreeSet(new TreeSet_Comparable_Comparator());
		trset.add(1);
		trset.add(4);
		trset.add(2);
		trset.add(7);
		trset.add(8);
		System.out.println(trset);
	}

	@Override
	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;

		if (i1 < i2) {
			return +1;
		} else if (i1 > i2) {
			return -1;
		} else {

		}
		return 0;
	}
}

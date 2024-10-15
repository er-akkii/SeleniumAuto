package collection_FrameWork;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationClass {

	public static void main(String[] args) {

		Vector vector = new Vector();
		Enumeration enmr = vector.elements();
		Iterator itr = vector.iterator();
		ListIterator litr = vector.listIterator();

		System.out.println(enmr.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
		System.out.println("java.util.Vector$1");
		System.out.println("java.util.Vector$Itr");
		System.out.println("java.util.Vector$ListItr");
	}
}

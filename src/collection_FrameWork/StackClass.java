package collection_FrameWork;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class StackClass {
	public static void main(String[] args) {

		VectorMethod();
	}

	// public static void ArrayListMethod() {
//		ArrayList obj=  new ArrayList();
//		System.out.println(obj.capacity());//10
//		for (int i =0 ; i<10;i++) {
//			obj.addElement("Raju");
//		}
//		System.out.println(obj.capacity());//10
//	    obj.addElement("yadav");
//	    System.out.println(obj.capacity());//20
	// }
	public static void stackMethod() {
		Stack obj = new Stack();
		obj.push("String");
		obj.push(null);
		obj.push("String");
		obj.push(45);
		System.out.println(obj.pop());
		System.out.println(obj);

	}

	public static void VectorMethod() {
		System.out.println("hahsgdffdghdjfhd");
		ArrayList obj = new ArrayList();
//		System.out.println(obj.capacity());//10
//		for (int i =0 ; i<10;i++) {
//			obj.addElement("Raju");
//		}
//		System.out.println(obj.capacity());//10
//	    obj.addElement("yadav");
//	    System.out.println(obj.capacity());//20
		for (int i = 0; i < 10; i++) {
			obj.add("hahaha");
		}
		obj.add(5, "KaHo");
		System.out.println(obj);
		ListIterator en = obj.listIterator();
		while (en.hasNext()) {
			if (en.equals("KaHo"))
				en.set("sdfgrty");
		}
		System.out.println("bbbbbb--" + obj);
	}
}
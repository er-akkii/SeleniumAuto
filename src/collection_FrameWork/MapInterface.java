package collection_FrameWork;


	import java.util.HashMap;
	import java.util.Hashtable;
	import java.util.IdentityHashMap;
	import java.util.LinkedHashMap;
	import java.util.Properties;
	import java.util.Set;
	import java.util.SortedMap;
	import java.util.TreeMap;
	import java.util.WeakHashMap;

	public class MapInterface {

		public static void main(String[] args) {
			HashMap mpobj = new HashMap();
			mpobj.keySet();
			System.out.println(mpobj);
			mpobj.put(4, "Alok");
			mpobj.put(1, "akshay");
			mpobj.put(3, "Alok");
			mpobj.put(2, "abhishek");
			System.out.println(mpobj);
			
			LinkedHashMap linkobj = new LinkedHashMap<>();
			linkobj.put(9, "Ra");
			linkobj.put(7, "Rura");
			linkobj.put(8, "Rudra");
			System.out.println(linkobj );
			
			IdentityHashMap idobj = new IdentityHashMap();
			idobj.put(2,"joker");
			idobj.put(1,"joker");
			System.out.println(idobj);
			
			WeakHashMap wobj = new WeakHashMap();
			wobj.put(2, "yadavGG");
			wobj.put(0, "yadav");
			wobj.put(1, "yadavG");
			System.out.println(wobj);
			
			
			
			TreeMap treobj = new TreeMap();
			treobj.put(1, "Tree");
			treobj.put(0, "Tree");
			treobj.put(2, "Tree");
			System.out.println(treobj);
			
			Properties propr = new Properties();
			propr.put(1, "o");
			propr.put(3, "o");
			propr.put(2, "o");
			System.out.println(propr);
		
			Hashtable hastbl = new Hashtable();
			hastbl.put(3, "a");
			hastbl.put(1, "a");
			hastbl.put(2, "a");
			System.out.println(hastbl);

		}
	}

package collection_FrameWork;


	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Iterator;

	public class ArayListClass //implements Collection  {
	         {
		public static void main(String[] args) {
		
			ArayListClass ar = new ArayListClass(); 

			 int y =ar.m1();
			System.out.println(y);
		}

		public  int m1() {
		ArrayList<String> a = new ArrayList<String>(); 
			
			a.add("akshay");
			a.add("kumar");
			a.add("yadav");
		
			
			System.out.println(a.size());
			int s= a.size();
			return s;
		
		}

	}

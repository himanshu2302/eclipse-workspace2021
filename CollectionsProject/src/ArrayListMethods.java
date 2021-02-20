import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("My");
		ar1.add("Name");
		ar1.add("is");
		System.out.println(ar1);

		//		System.out.println("--------------------------------");
		//
		//		ArrayList<String> ar2 = new ArrayList<String>();
		//		ar2.add("Himanshu");
		//		ar2.add("Dubey");
		//		System.out.println(ar2);
		//
		//		//ar1.addAll(ar2);
		//		System.out.println(ar1);
		//		System.out.println("--------------------------------");
		//
		//		ar1.add(3, "Shubhanshu");
		//		System.out.println(ar1);
		//		System.out.println("--------------------------------");
		//		ar1.addAll(2, ar2);
		//		System.out.println(ar1);
		//		System.out.println("--------------------------------");

		Object clone = ar1.clone();
		System.out.println("Cloned list is : "+clone);

		boolean contains = ar1.contains("Name");
		System.out.println(contains);
		



	}
}

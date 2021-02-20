import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
	public static void main(String[] args) {


		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add("My");
		ar.add("Name");
		ar.add("is");
		ar.add("Himanshu"); 

		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("-------------------------------------");
		for (Object object : ar) {
			System.out.println(object);
		}
		System.out.println("-------------------------------------");
		Iterator<Object> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
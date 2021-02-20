
public class DerivedClass extends BaseClass {
	public void add() {
		System.out.println("this is derived class method");
	}
	static void subtract() {
		System.out.println("this isderived class subtract method");
	}
	@Override
	public void divide() {
		System.out.println("this is implemented method of base class");
		
	}
}

package Course;

class parent{
	public void cm1(){
		System.out.println("Common Method 1");
	}
	public void cm2(){
		System.out.println("Common Method 2");
	}
	public void cm3(){
		System.out.println("Common Method 3");
	}
}

class child extends parent{
	public void sm() {
		System.out.println("Specific Method at child");
	}
	public void cm2() {
		System.out.println("This is a override method cm2 from child");
	}
}

/*
	 Method Overriding
		The child class overrides cm2() from the parent class.
	 Dynamic Method Dispatch (Runtime Polymorphism)
		When a superclass reference (parent obj1 = new child();) points to a subclass object, the overridden method from the subclass is called at runtime.
	 Method Resolution
		The cm2() method is resolved at runtime based on the actual object's type.
		
	Important Notes
		Dynamic method dispatch applies only to overridden methods.
		If a method is not overridden, the superclass version is called.
		You cannot call child-specific methods (sm()) using a superclass reference.
 */

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		parent obj = new parent();
		obj.cm1();
		obj.cm2();
		obj.cm3();
		parent obj1 = new child();
		obj1.cm1();
		obj1.cm2();
		obj1.cm3();
		child obj2 = new child();
		obj2.cm1();
		obj2.cm2();
		obj2.cm3();
		obj2.sm();
	}

}

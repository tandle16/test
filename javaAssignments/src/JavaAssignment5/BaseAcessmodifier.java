
/* Assignment 5.(3Q) AccessModifiers */


package JavaAssignment5;

public class BaseAcessmodifier {
	
	public void Basepublicmethod() {
		//same class
		System.out.println("Base Public Method");
		BasePrivatemethod();
		BaseDefaultModifierMethod();
		BaseProtectedmethod();
	}

	protected void BaseProtectedmethod() {
		System.out.println("Base Protected Method");
	}

	void BaseDefaultModifierMethod() {
		System.out.println("Base Default Method");
	}

	private void BasePrivatemethod() {
		System.out.println("Base Private Method");
	}

}
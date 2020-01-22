
/* Assignment 5.(3Q) AccessModifiers */


package JavaAssignment5;

//same Package non subclass
public class CallAcessmodifier {

	public static void main(String[] args) {
	
		BaseAcessmodifier bam=new BaseAcessmodifier();
		
		bam.BaseDefaultModifierMethod();
		
//bam.Baseprivatemethod();
		bam.BaseProtectedmethod();
		bam.Basepublicmethod();
	}
}
//same package sub class
class DerivedAxessModifier extends BaseAcessmodifier {
	public void DerivedpublicMethod() {
		System.out.println("DerivedpublicMethod");
		super.Basepublicmethod();
		super.BaseProtectedmethod();
	//	 BasePrivatemethod();
	}
}

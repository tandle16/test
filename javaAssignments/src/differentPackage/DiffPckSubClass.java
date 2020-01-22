
/* Assignment 5.(3Q) AccessModifiers */


package differentPackage;
import JavaAssignment5.BaseAcessmodifier;
import javaAssignment4.*;

public class DiffPckSubClass extends  BaseAcessmodifier  {

	
	
	public void differentpackagemethod()
	{ 
		super.BaseProtectedmethod();
		super.Basepublicmethod();
		//super.BasePrivatemethod();
		//super.Basedefaultmethod();
	}	
	public static void main(String[] args) {
		DiffPckSubClass obj=new DiffPckSubClass();
           obj.differentpackagemethod();
	}

}

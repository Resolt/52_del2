package MainPackage;
import java.io.IOException;

import ControllerPackage.FunctionalityController;


public class MainPackage {
	
	public static void main(String args[])throws IOException{
		
		FunctionalityController init = new FunctionalityController();
			
		init.run();
	}
	
}

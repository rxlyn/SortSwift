package controllerSystem;

import utilities.structure.ModelProductRequest;
import utilities.structure.Request;

public class ControllerProductPurchase implements IController{

	public void access(ModelProductRequest request) {
		//Call function controlerPuchaseLogic
		ControllerPuchaseLogic.puchase(request);
		
	}

	@Override
	public void access(Request request) {
		// TODO Auto-generated method stub
		
	}

}


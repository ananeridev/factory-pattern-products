package factory.factory;

import factory.model.IPhone11;
import factory.model.IPhone;


public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}

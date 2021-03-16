package factory.factory;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}

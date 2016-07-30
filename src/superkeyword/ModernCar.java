package superkeyword;

public class ModernCar extends Car {
	
	public ModernCar(String model){
		super(model);
		
	}
	public void fuelType(){
		super.runOnElectricBattery();
	}

	
}

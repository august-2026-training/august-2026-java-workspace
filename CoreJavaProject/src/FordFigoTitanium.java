
public class FordFigoTitanium extends FordFigo{
	int noOfAirbags;
	
	public FordFigoTitanium(String modelName, String color, int noOfAirbags) {
		super(modelName, color);
//		this.modelName = modelName;
//		this.color = color;
		this.noOfAirbags = noOfAirbags;
	}
	
	@Override
	boolean applyBrakes() {
		System.out.println(modelName + "applied ABS Brakes...");
		return true;
	}
	
	boolean ejectAirbags() {
		System.out.println(modelName + " ejected airbags...");
		return true;
	}
}

package task01;

public class Rudder {

	private double steeringWheelDiameter;
	private String material;

	public Rudder(double steeringWheelDiameter, String material) {
		super();
		this.steeringWheelDiameter = steeringWheelDiameter;
		this.material = material;
	}

	public double getSteeringWheelDiameter() {
		return steeringWheelDiameter;
	}

	public void setSteeringWheelDiameter(double steeringWheelDiameter) {
		this.steeringWheelDiameter = steeringWheelDiameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Rudder [steeringWheelDiameter=" + steeringWheelDiameter + ", material=" + material + "]";
	}

}
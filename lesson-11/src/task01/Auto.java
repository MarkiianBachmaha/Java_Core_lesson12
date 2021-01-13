package task01;

public class Auto {

	private int numberOfHorsepower;
	private int graduationYear;
	private Engine engine;
	private Rudder rudder;

	public Auto(int numberOfHorsepower, int graduationYear, Engine engine, Rudder rudder) {
		super();
		this.numberOfHorsepower = numberOfHorsepower;
		this.graduationYear = graduationYear;
		this.engine = engine;
		this.rudder = rudder;
	}

	public int getNumberOfHorsepower() {
		return numberOfHorsepower;
	}

	public void setNumberOfHorsepower(int numberOfHorsepower) {
		this.numberOfHorsepower = numberOfHorsepower;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Rudder getRudder() {
		return rudder;
	}

	public void setRudder(Rudder rudder) {
		this.rudder = rudder;
	}

	@Override
	public String toString() {
		return "Auto [numberOfHorsepower=" + numberOfHorsepower + ", graduationYear=" + graduationYear + ", engine="
				+ engine + ", rudder=" + rudder + "]";
	}

}
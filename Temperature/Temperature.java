package Temperature;

public class Temperature {
	/**
	 * Initial temperature in Celsius.
	 */
	private Integer tempC;
	
	/**
	 * Constructor for temperature set in Celsius
	 * @param temp
	 */
	public Temperature(Integer temp){
		this.tempC = temp;
	}
	
	/**
	 * Changes temperature used in other class
	 * @param temp - in Celsius
	 */
	public void setTemp (int temp) {
		this.tempC = temp;
	}
	
	/**
	 * Presents temperature in Celsius
	 * @return
	 */
	public Integer getTempInC() {
		return tempC;
	}
	
	/**
	 * Presents temperature in Kelvins
	 * @return
	 */
	public Double getTempInK() {
		Double tempK = tempC + 274.15;
		return tempK;
	}
	
	/**
	 * Presents temperature in Fahrenheit
	 * @return
	 */
	public Double getTempInF() {
		Double tempF = 32.0 + (tempC*1.8);
		return tempF;
	}
	
	/**
	 * Transforms object Temperature in a String
	 */
	public String toString() {
		String s = "Temperature " + getTempInC() + " is in Celsius" + ".\n";
		s = s + "This temperature in Kelvins is " + getTempInK() + ",\n";
		s = s + "and in Fahrenheits it's " + getTempInF();
		return s;
	}

}

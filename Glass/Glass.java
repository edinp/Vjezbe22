package Glass;

public class Glass {
	
	private String type;
	private Integer liquid;
	private Integer capacity;
	
	/**
	 * Constructor for Glass
	 * @param capacity - max capacity of glass
	 */
	public Glass(Integer capacity){
		this.liquid = 0;
		this.type = null;
		this.capacity = capacity;
	}
	
	/**
	 * Transforms object to String
	 */
	public String toString() {
		String s = "This glass has " + getLiquid() + " liquid.";
		return s;
	}
	
	/**
	 * Returns type of liquid in glass
	 * @return
	 */
	public String getType(){
		return type;		
	}
	
	/**
	 * Returns max capacity of glass
	 * @return
	 */
	public Integer getCapacity(){
		return capacity;
	}
	
	/**
	 * Returns current amount of liquid in glass
	 * @return
	 */
	public Integer getLiquid(){
		return liquid;
	}
	
	/**
	 * Adds liquid in glass. If liquid > capacity, spills out rest of liquid.
	 * @param type - of liquid
	 * @param a - amount of added liquid
	 */
	public void addLiquid(String type, Integer a){
		if (type != null){
			System.out.println("Nothing added! Type of liquid is different. Liquid in glass: " + liquid);
		}
		else {
			liquid+=a;
			if (liquid <= capacity){
				System.out.println("Liquid added! Liquid in glass: " + liquid);
			} else if (liquid > capacity) {
				liquid = capacity;
				System.out.println("Added liquid is beyond capacity! Liquid in glass: " + liquid);
			}
		}
	}
	
	/**
	 * Glass is empty.
	 */
	public void emptyGlass() {
		liquid = 0;
		System.out.println("Glass is empty. Liquid: " + liquid);
	}
	
	
	

}

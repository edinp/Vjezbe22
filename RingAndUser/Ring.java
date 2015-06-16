package RingAndUser;

public class Ring {
	
	private Integer x;
	private Integer y;
	
	private Integer radius;
	
	
	public Ring (Integer x, Integer y, Integer radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public Integer getPositionX () {
		return x;
	}
	
	public Integer getPositionY () {
		return y;
	}
	
	public Integer getRadius () {
		return radius;
	}
	
	public void setPositionX(int x) {
		this.x = x;
	}
	
	public void setPositionY(int y) {
		this.y = y;
	}
	
	public void setRadius(int r) {
		this.radius = r;
	}
	
	public String toString() {
		String position = String.format("Ring info: center(x=%d, y=%d), radius=%d ", x, y, radius);
		return position;
	}
	
	public Ring(Ring other) {
		this(other.x,other.y, other.radius);
	}
	
	public boolean equals (Ring other) {
		if (this.x == other.x && this.y == other.y && this.radius == other.radius) {
			return true;
		}
		return false;
	}
	
	public Double getDistance (Ring other) {
		return Math.sqrt((this.x - other.x)*(this.x - other.x) + (this.y - other.y)*(this.y-other.y));
	}
	
	public boolean intersect (Ring other) {
		if (getDistance(other) < (this.radius+other.radius)) {
			return true;
		} return false;
	}
}

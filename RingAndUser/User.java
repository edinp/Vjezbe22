package RingAndUser;

public class User {
	
	public static int userCount = 0;
	
	private String name;
	private String surname;
	private Integer age;
	private Integer id;
	
	public User (String name, String surname, Integer age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.id = ++userCount;
	}
	
	public User (String name, String surname) {
		this(name, surname, 0);
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		String output = String.format("Name: %s, Surname: %s, Id: %d", name, surname, id);
		return output;
	}
	
	public boolean equals(User other) {
		if (this.name.equals(other.name) && this.surname.equals(other.surname) 
				&& this.age == other.age) {
			return true;
		}
		return false;
	}
	
	public User(User other) {
		this(other.name, other.surname, other.age);
		userCount--;
		this.id = other.id;
	}

}

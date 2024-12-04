package Ch_22.Spring1;

public class student1 {
	String clg;
	String location;
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "student1 [clg=" + clg + ", location=" + location + "]";
	}

}

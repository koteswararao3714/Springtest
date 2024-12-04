package Ch_22.Spring1;

public class student {
	int id;
	String name;
	student1 s;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public student1 getS() {
		return s;
	}
	public void setS(student1 s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", s=" + s + "]";
	}
	

}

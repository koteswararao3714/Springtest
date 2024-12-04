package Ch_22.Spring1;

public class employe1 {
	int salary;
	String dept;
	public employe1(int salary, String dept) {
		super();
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "employe1 [salary=" + salary + ", dept=" + dept + "]";
	}

}

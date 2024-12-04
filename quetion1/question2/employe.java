package Ch_22.Spring1;

public class employe {
	int emp_id;
	String name;
	employe1 e;
	public employe(int emp_id, String name, employe1 e) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.e = e;
	}
	@Override
	public String toString() {
		return "employe [emp_id=" + emp_id + ", name=" + name + ", e=" + e + "]";
	}

}

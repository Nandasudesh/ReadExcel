package abstraction;

public class FullTimeEm extends Employee {

	FullTimeEm(String name, int payPerHour) {
		super(name, payPerHour);
	}

	@Override
	public int calculateSalary() {
		
		return (getPayPerHour()*8);
	}

}

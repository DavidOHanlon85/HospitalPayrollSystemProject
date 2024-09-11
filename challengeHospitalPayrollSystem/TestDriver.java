package challengeHospitalPayrollSystem;

public class TestDriver {

	// Constants

	public static final double HOURS_WORKED_PER_WEEK = 35;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee p1 = new Pharmacist("John", "Paul", 21, 4, 25);
		Employee po1 = new Porter("Peter", "Parker", 16, "RVH");
		Employee s1 = new Surgeon("Matthew", "Longknife", 21, "Operations", 1000);
		
		Employee[] employees = new Employee[] {p1, po1, s1};
		
		for (Employee e : employees) {
			e.printAll();
			e.calculateWeeklySalary(HOURS_WORKED_PER_WEEK);
		}
		

	}

}

/**
 * 
 */
package challengeHospitalPayrollSystem;

/**
 * This is the pharmacist class
 */
public class Pharmacist extends Employee {

	// Instance variables

	private int grade;
	private double bonus;

	// Constructors

	/**
	 * This is the default constructor
	 */
	public Pharmacist() {

	}

	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.setGrade(grade);
		this.setBonus(bonus);
	}

	// Getters and setters

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	// calculateWeeklySalary method

	@Override
	public void calculateWeeklySalary(double hours) {
		double salary;
		salary = hours * getBaseRate() + bonus;
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f = £%.2f", this.getFirstName(), this.getLastName(),
				"Pharmacist", hours, this.getBaseRate(), this.getBonus(),
				salary);
		
	}

	// printAllMethod

	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Grade : %d, Bonus :£%.2f", "Pharmacist",
				this.getFirstName(), this.getLastName(), this.getBaseRate(), this.getGrade(),
				this.getBonus());
	}

}

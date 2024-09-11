/**
 * 
 */
package challengeHospitalPayrollSystem;

/**
 * This is the surgeon class
 */
public class Surgeon extends Employee {

	// Instance variables

	private String specialistArea;
	private double consultationFee;

	// Constructors

	/**
	 * This the the default constructor
	 */
	public Surgeon() {

	}

	/**
	 * This is the constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param specialistArea
	 * @param ConsultationFee
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double ConsultationFee) {
		super(firstName, lastName, baseRate);
		this.setSpecialistArea(specialistArea);
		this.setConsultationFee(ConsultationFee);
	}

	// Getter and setters

	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	// calculateWeeklySalary method

	@Override
	public void calculateWeeklySalary(double hours) {
		double salary;
		salary = hours * getBaseRate() + consultationFee;

		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f = £%.2f", this.getFirstName(),
				this.getLastName(), "Surgeon", hours, this.getBaseRate(), this.getConsultationFee(), salary);
	}

	// printAllMethod

	@Override
	public void printAll() {

		System.out.printf("[%-10s] %-20s %-20s £%.2f Specialist Area : %s, Consultation Fee :£%.2f", "Surgeon",
				this.getFirstName(), this.getLastName(), this.getBaseRate(), this.getSpecialistArea(),
				this.getConsultationFee());
	}

}

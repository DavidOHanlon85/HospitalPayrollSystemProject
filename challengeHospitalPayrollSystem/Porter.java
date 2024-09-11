/**
 * 
 */
package challengeHospitalPayrollSystem;

/**
 * This is the porter class
 */
public class Porter extends Employee {

	// Instance variables

	private String site;

	// Constructors

	/**
	 * This is the default constructor
	 */
	public Porter() {
	}

	/**
	 * Constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param site
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.setSite(site);
	}

	// Getters and setters

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	// calculateWeeklySalary method

	@Override
	public void calculateWeeklySalary(double hours) {
		// TODO Auto-generated method stub
		double salary;
		salary = hours * getBaseRate();
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f = £%.2f", this.getFirstName(), this.getLastName(),
				"Porter", hours, this.getBaseRate(), salary);
		
		
	}

	// printAllMethod
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s £%.2f Site : %s,", "Porter",
				this.getFirstName(), this.getLastName(), this.getBaseRate(), this.getSite());
	}

}

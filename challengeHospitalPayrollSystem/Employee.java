/**
 * 
 */
package challengeHospitalPayrollSystem;

/**
 * 
 */
public abstract class Employee {
	
	// Instance variable
	
	private String firstName;
	private String lastName;
	private double baseRate; 
	
	// Constructors
	
	/** 
	 * This is the default constructor
	 */
	public Employee() {
		
	}
	
	/**
	 * This it the constructor with args
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Employee(String firstName, String lastName, double baseRate) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBaseRate(baseRate);
	}



	// Getters and Setters
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return baseRate;
	}
	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	
	// calculateWeeklySalary method
	
	public abstract void calculateWeeklySalary(double hours);
	
	// printAll method
	
	/**
	 * This method displays all details to console
	 * @return
	 */
	
	public void printAll() {
		System.out.printf("[%-10s] %-20s %-20s �%.2f","Employee",this.firstName, this.lastName, this.baseRate);
	}
	
	
	
	

}

/**
 * 
 */
package challengeHospitalPayrollSystem;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 */
public class PayrollManager {

	/**
	 * @param args
	 */

	// Constants

	public static final double HOURS_PER_WEEK = 35;
	
	// Static array to hold employees
	public static Employee[] employees = new Employee[6];

	public static void main(String[] args) {

		Employee porter1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Employee porter2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Employee s1 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650.00);
		Employee s2 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800.00);
		Employee p1	= new Pharmacist("Poppy", "Pill", 30.50, 7, 750.00);
		
		addEmployeeToArray(porter1);
		addEmployeeToArray(porter2);
		addEmployeeToArray(s1);
		addEmployeeToArray(s2);
		addEmployeeToArray(p1);
		
		// Display all employees
		
		System.out.println("Display all employees ________________________________");
		System.out.printf("[%-10s] %-20s %-20s %-6s %s \n", "Type",
				"First name", "Last name", "Rate", "Other");
		int numberOfStaff = 0;
		for (Employee e : employees) {
			if (e!=null) {
				e.printAll();
				numberOfStaff++;
				System.out.println();
			}
		}
		System.out.println("Total employees in system : "+numberOfStaff);
		System.out.println("______________________________________________________");
		
		
		System.out.println();
		// Process Weekly Payroll
		
		processWeeklyPayroll();
	}

	/**
	 * This method processes the payroll for all staff and displays this on the console
	 */
	public static void processWeeklyPayroll() {
		System.out.println("Payroll run..... _____________________________________");
		int numberOfStaff = 0;
		for (Employee e : employees) {
			if (e!=null) {
				e.calculateWeeklySalary(HOURS_PER_WEEK); 
				numberOfStaff++;
				System.out.println();
			}
		}
		System.out.println("Total salaries processed : "+numberOfStaff);
		System.out.println("______________________________________________________");
	}

	/**
	 * This method ensure each employee is added to an available space in the array.
	 * @param employee
	 */
	public static void addEmployeeToArray(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = employee;
				break;
			}
		}
	}

}

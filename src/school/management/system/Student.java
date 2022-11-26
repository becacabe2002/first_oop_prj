package school.management.system;
// Keep track of student's fees that have to be paid
// Contain student's name, grade, fees

public class Student {
	private int id; // protect unwanted access
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	
	/**
	 * Initializing new student
	 * @param id - unique student's id
	 * @param name - student's name
	 * @param grade - student's grade
	 */
	public Student(int id, String name, int grade){
		
		feesPaid = 0;// there is no parameter for this attribute -> no need to use 'this'
		feesTotal = 10000;
		this.id = id; // unchanged
		this.name = name; // unchanged
		this.grade = grade;
		
	}
	
	/**
	 * Update grade attribute for student object
	 * @param grade - new grade for student
	 */
	public void setGrade(int grade){
		this.grade = grade;
	}
	
	/**
	 * Update remaining fees
	 * @param fees - recent paid fees
	 */
	public void updateFeesPaid(int fees){
		this.feesPaid += fees;
		//this.feesTotal -= fees;
	}
	
}

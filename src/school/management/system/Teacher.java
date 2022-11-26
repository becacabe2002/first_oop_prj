package school.management.system;

/**
 * 
 * 
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;


    /**
     * Constructor for Teacher variable
     * @param id - id for the teacher 
     * @param name - name of the teacher
     * @param salary - salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getID() { 
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void receiveSalary(){
        School.updateMoneySpent(this.salary);
    }
}

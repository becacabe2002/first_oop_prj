package school.management.system;

import java.util.List;

/**
 * Create Teacher and Student ArrayList
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneySpent;
    private static int totalMoneyEarned;

    /**
     * Constructor for School
     * @param teachers - list of teachers in the School
     * @param students - list of students in the School
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    /**
     * Add spent money to the total amount of money school spent to pay for the teachers.
     * @param MoneySpent
     */
    public static void updateMoneySpent(int MoneySpent) {
        totalMoneySpent += MoneySpent;
        totalMoneyEarned -= MoneySpent;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Add earned money to the total amount of money school earned
     * @param MoneyEarned
     */
    public static void updateMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    
    
}

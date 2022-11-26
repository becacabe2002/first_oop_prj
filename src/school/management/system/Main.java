package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher (1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher (3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(lizzy);
        teacherList.add(vanderhorn);
        teacherList.add(mellisa);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith Vasudev",12);
        Student rabbi = new Student (3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School SCH = new School (teacherList, studentList);
        System.out.println("SCH have " + SCH.getTotalMoneyEarned() + "$ in their account.");
        
        tamasha.payFees(100);
        System.out.println("Tamasha have paid " + tamasha.getFeesPaid() + "$.\n The remaining fees is " + tamasha.getRemainingFees() + "$.");
        System.out.println("SCH have " + SCH.getTotalMoneyEarned() + "$ in their account.");

    }
    
}

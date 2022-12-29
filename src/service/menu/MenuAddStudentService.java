package service.menu;

import bean.Config;
import bean.Student;
import service.inter.menu.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void processLogic() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Surname:");
        String surname = scanner2.nextLine();

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);

        Config.instance().appendStudent(student);
        System.out.println("Student added !");


    }
}

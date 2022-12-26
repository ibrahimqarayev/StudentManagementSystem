package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void processAbstract() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Surname:");
        String surname = scanner2.nextLine();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurname(surname);

        Config.instance().appendTeacher(teacher);
        System.out.println("Teacher added !");

        Config.save();
    }
}

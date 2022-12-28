package service.menu;

import bean.Config;
import bean.Teacher;
import service.inter.menu.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {

    @Override
    public void processLogic() {
        Teacher[] teachers = Config.instance().getTeachers();
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i]);
        }

    }
}

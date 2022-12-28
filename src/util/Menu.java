package util;

import bean.Config;
import service.menu.*;
import service.inter.Process;


public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", new MenuAddStudentService()),
    ADD_TEACHER(4, "Add teacher", new MenuAddTeacherService()),
    SHOW_ALL_STUDENT(5, "Show all students", new MenuShowStudentService()),
    SHOW_ALL_TEACHER(6, "Show all teachers", new MenuShowTeacherService()),
    UNKNOWN;

    private int number;
    private String label;
    private Process service;


    Menu() {
    }

    Menu(int number, String label, Process service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }


    @Override
    public String toString() {
        return number + "." + label;
    }

    public String getLabel() {
        return label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {

            if (menus[i] != Menu.UNKNOWN) {

                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }

}

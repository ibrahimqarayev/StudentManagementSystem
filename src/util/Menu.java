package util;

import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.inter.MenuService;


public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_STUDENT(3, "Add student", null),
    ADD_TEACHER(4, "Add teacher", null),
    SHOW_ALL_TEACHER(5, "Show all teachers", null),
    SHOW_ALL_STUDENT(6, "Show all students", null),
    UNKNOWN;

    private int number;
    private String label;
    private MenuService service;


    Menu() {
    }

    Menu(int number, String label, MenuService service) {
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
                System.out.println(menus[i]);
            }
        }
    }

}

package util;

import service.menu.MenuLoginService;
import service.menu.MenuService;

public enum Menu {
    LOGIN("Login",new MenuLoginService()),
    REGISTER("Register",null),
    ADD_STUDENT("Add student",null),
    ADD_TEACHER("Add teacher",null),
    SHOW_ALL_TEACHER("Show all teachers",null),
    SHOW_ALL_STUDENT("Show all students",null);

    private String label;
    private MenuService service;

    Menu(String label,MenuService service) {
        this.label = label;
        this.service=service;
    }

    public String getLabel() {
        return label;
    }

    public void processMenu() {
        service.process();
    }
}

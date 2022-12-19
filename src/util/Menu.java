package util;

public enum Menu {
    LOGIN("Login"),
    REGISTER("Register"),
    ADD_STUDENT("Add student"),
    ADD_TEACHER("Add teacher"),
    SHOW_ALL_TEACHER("Show all teachers"),
    SHOW_ALL_STUDENT("Show all students");

    String label;

    Menu(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

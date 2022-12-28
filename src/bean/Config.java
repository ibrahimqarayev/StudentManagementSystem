package bean;

import util.FileUtility;

import java.io.Serializable;


public class Config implements Serializable {
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static Config config = null;
    private static boolean loggedIn;

    public static void initialize() {
        Object object = FileUtility.readFileDeserialize("app.obj");
        if (object == null) {
            return;
        }
        if (object instanceof Config) {
            config = (Config) object;
        }
    }


    public static void save() {
        FileUtility.writeObjectToFile(Config.instance(), "app.obj");
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void appendStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = student;
        students = newStudents;
    }


    public void appendTeacher(Teacher teacher) {

        Teacher[] newTeachers = new Teacher[teachers.length + 1];

        for (int i = 0; i < teachers.length; i++) {
            newTeachers[i] = teachers[i];
        }
        newTeachers[newTeachers.length - 1] = teacher;
        teachers=newTeachers;
    }


    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

}

package util;

public class MenuUtil {

    public static void showMenu() {
        Menu[] menus = Menu.values();
        for (int i=0;i<menus.length;i++){
            System.out.println(menus[i]);
        }
    }

    public static void processMenu(Menu menu) {


    }

}

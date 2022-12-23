package util;

import java.util.Scanner;

public class MenuUtil {

    public static Menu showMenu() {

        System.out.println("Please enter number:");
        Menu.showAllMenu();
        Scanner scanner = new Scanner(System.in);
        int selectedMenu = scanner.nextInt();
        return Menu.find(selectedMenu);
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }

}

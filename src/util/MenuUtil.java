package util;

import java.util.Scanner;

public class MenuUtil {

    public static void showMenu() {

        System.out.println("Please enter number:");
        Menu.showAllMenu();
        Scanner scanner = new Scanner(System.in);
        int selectedMenuNumber = scanner.nextInt();

        Menu selectedMenu = Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }

}

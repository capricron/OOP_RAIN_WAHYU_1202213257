package Modul1;

import java.util.ArrayList;

public class Database {

    public ArrayList<Menu> menu = new ArrayList<>(3);

    public Database() {
        Menu menu1 = new Menu();
        menu1.setMenuName("Nasgor");
        menu1.setMenuPrice(10000);
        menu1.setMenuCategory("Makanan");
        menu.add(menu1);

        Menu menu2 = new Menu();
        menu2.setMenuName("Teh");
        menu2.setMenuPrice(5000);
        menu2.setMenuCategory("Minuman");
        menu.add(menu2);

        Menu menu3 = new Menu();
        menu3.setMenuName("Brownies");
        menu3.setMenuPrice(5000);
        menu3.setMenuCategory("Dessert");
        menu.add(menu3);
    }

    public void insertMenu() {

    }

    public void showMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i).name + " " + " (" + menu.get(i).category + ") " + "Rp."
                    + menu.get(i).price);
        }
    }

    public void searchMenu(String pilihan) {
        for (int i = 0; i < menu.size();) {
            if (menu.get(i).name.equals(pilihan)) {
                System.out.println((i + 1) + ". " + menu.get(i).name + " " + " (" + menu.get(i).category + ") " + "Rp."
                        + menu.get(i).price);
                break;
            } else {
                System.out.println("Menu tidak ditemukan");
                i++;
            }
        }
    }

}

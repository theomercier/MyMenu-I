package com.ocr.anthony;

import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu()
    {

        System.out.println("Choix menu");
        System.out.println("1 - Poulet");
        System.out.println("2 - Boeuf");
        System.out.println("3 - Végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");

    }

    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */

    public void displaySelectedMenu(int nbMenu)
    {
        /*Scanner sc = new Scanner(System.in);
        int nbMenu = sc.nextInt();*/

        System.out.println("Vous avez choisi le menu : " +nbMenu);
    }
}
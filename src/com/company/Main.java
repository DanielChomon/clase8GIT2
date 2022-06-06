package com.company;

import java.util.Scanner

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();

        Menu menu = new Menu();
        menu.menuCreacion();
        menu.menuReportes();
    }
}

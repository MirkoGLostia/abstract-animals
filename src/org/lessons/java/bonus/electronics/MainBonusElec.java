package org.lessons.java.bonus.electronics;

import java.util.Scanner;

public class MainBonusElec {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // variables
        String name;
        boolean exit = false;

        // chiediamo nome dispositivo
        System.out.println("gimme name of device");
        name = userInput.nextLine();
        Functionality device = null;

        // creiamo il dispositivo
        do {
        System.out.println("what device is it? 1-playstation 2-DVDreader");
        int choice = Integer.parseInt(userInput.nextLine());
        if (choice == 1) {
            device = Creator.create("playstation", name);
            exit = true;
        } else if (choice == 2) {
            device = Creator.create("DVDreader", name);
            exit = true;
        }
        } while (!exit);

        device.play();
        device.stop();


    }
}

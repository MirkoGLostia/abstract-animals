package org.lessons.java.bonus.electronics;

import java.util.Scanner;

public class MainBonusElec {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // variables
        String name;
        int deviceType;
        boolean exit = false;

        // chiediamo nome dispositivo
        System.out.println("gimme name of device");
        name = userInput.nextLine();

        // creiamo il dispositivo
        do {
        System.out.println("what device is it? 1-playstation 2-DVDreader");
        deviceType = Integer.parseInt(userInput.nextLine());
        if (deviceType > 0 && deviceType < 3) {
            exit = true;
        }
        } while (!exit);

        Functionality device = Creator.create(deviceType, name);

        device.play();
        device.stop();


    }
}

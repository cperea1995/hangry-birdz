package com.example.hangrybirdz;

import java.util.Scanner;

public class AngleGetter implements IAngleGetter {





    public String getInput() {
        System.out.println("Please enter an angle between 1 and 90");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan  =  new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        try {
            Box box = new Box(length, width, height);
            System.out.println(box.calculateSurfaceArea(length, width, height));
            System.out.println(box.calculateLateralSurfaceArea(length, width, height));
            System.out.println(box.calculateVolume(length, width, height));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

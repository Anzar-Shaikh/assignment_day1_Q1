package com.bl.assignment;

import java.util.Random;
import java.util.Random;
public class empWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation. ");
        Random rand = new Random();

        int present = 1;
        int absent = 2;
        int part_time_present = 3;
        int check=rand.nextInt(3)+1;
        int wage_per_hr = 20;
        int full_day_hr = 8;
        int part_time_hr = 4;

        if (check == present) {
            System.out.println("Employee is present.");
        }
        else if (check == part_time_present) {
            System.out.println("Employee is present for part time.");
        }

        else {
            System.out.println("Employee is absent.");
        }

    }
}

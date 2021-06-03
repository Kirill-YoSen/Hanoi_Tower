package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter amount of the disks: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("###### [Soulution] ######");
        hanoiTower(n, 1,3,2);
    }

    public static void hanoiTower(int disks, int start, int end, int buffer) {
        if (disks == 1) {
            System.out.println("disk [" + disks + "] " + start + " -> " + end);
            return;
        } else {
            hanoiTower(disks-1, start, buffer, end);
            System.out.println("disk [" + disks + "] " + start + " -> " + end);
            hanoiTower(disks-1, buffer,end,start);
        }
    }
}


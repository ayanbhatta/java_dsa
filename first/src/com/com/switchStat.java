package com.com;

import java.util.Scanner;

public class switchStat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String section = sc.next();
        switch (section) {
            case "cse" -> System.out.println("CSE dept");
            case "ece" -> System.out.println("ECE dept");
            case "block chain" -> System.out.println("Block Chain");
            default -> System.out.println("Invalid syntax");
        }
    }
}

package org.example;

import java.util.Scanner;

public class urinals {
    static String urinalString;

    public static void main(String[] args) {
        getUrinalString();
    }
    public static void getUrinalString() {
        //System.out.println("Not yet implemented");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your urinals string");
        urinalString = sc1.next();
    }

    public static int countUrinals(){
        return 0;
    }

    public static int checkValidString(){
        return 0;
    }
}

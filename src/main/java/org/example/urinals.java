package org.example;

import java.util.Scanner;

public class urinals {
    //static String urinalString;
    static int l;

    public static String getUrinalString() {
        //System.out.println("Not yet implemented");
        String urinalString;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your urinals string");
        urinalString = sc1.next();
        return urinalString;
    }

    public static int countUrinals(String urinalString){

        int count = 0;


        return count;
    }

    public static int checkValidString(String urinalString){
        l = urinalString.length();
        int c=0;
        if(l>20 || l<1){
            c=-1;
        }
        else {
            String x, y;
            for (int i = 0; i < l - 1; i++) {
                x = String.valueOf(urinalString.charAt(i));
                y = String.valueOf(urinalString.charAt(i + 1));
                if (x.equals("1") & y.equals("1")) {
                    c = -1;
                    break;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String urinalString = getUrinalString();
        //int ln = urinalString.length();
        countUrinals(urinalString);
    }
}

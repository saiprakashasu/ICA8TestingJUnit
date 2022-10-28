package org.example;

import java.util.Scanner;

public class urinals {
    //static String urinalString;
    static int l;

    public static String getUrinalStringKeyboard() {
        //System.out.println("Not yet implemented");
        String urinalString;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your urinals string");
        urinalString = sc1.next();
        return urinalString;
    }

    public static int countUrinals(String urinalString){

        int count = 0;
        count = checkValidString(urinalString);
        if(count!=-1){
            String x = String.valueOf(urinalString.charAt(0));
            String y = String.valueOf(urinalString.charAt(1));
            String z;
            StringBuilder sb = new StringBuilder(urinalString);

            if(x.equals("0") & y.equals("0")){
                sb.setCharAt(0, '1');
                count++;
            }

            for (int i = 2; i < l - 2; i++) {
                x = String.valueOf(sb.charAt(i-1));
                y = String.valueOf(sb.charAt(i));
                z = String.valueOf(sb.charAt(i+1));
                if (x.equals("0") & y.equals("0") & z.equals("0")) {
                    sb.setCharAt(i, '1');
                    count++;
                }
            }

            x = String.valueOf(sb.charAt(l-2));
            y = String.valueOf(sb.charAt(l-1));
            if(x.equals("0") & y.equals("0")){
                sb.setCharAt(l-1, '1');
                count++;
            }
        }

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

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Press 1. for keyboard input 2. for file input");
        String in = sc1.next();
        if(in.equals("1")){
            while(true) {
                String urinalString = getUrinalStringKeyboard();
                if(urinalString.equals("0")){break;}
                int res = countUrinals(urinalString);
                System.out.println(res);
            }
        }

    }
}

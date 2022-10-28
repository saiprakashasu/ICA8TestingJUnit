package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class urinals {
    //static String urinalString;
    static int l;

    public static String getUrinalStringKeyboard() {
        //System.out.println("Not yet implemented");
        String urinalString;
        Scanner sc1 = new Scanner(System.in);
        //System.out.println("Enter your urinals string");
        urinalString = sc1.next();
        return urinalString;
    }
    public static void getUrinalStringFile(){
        try {
            File f = new File("inputFile\\urinals.dat");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String urinalString;
            ArrayList<Integer> a = new ArrayList<>();
            while ((urinalString = br.readLine()) != null) {
                int res = countUrinals(urinalString);
                a.add(res);
            }
            br.close();
            printUrinalStringFile(a);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printUrinalStringFile(ArrayList<Integer> a) throws IOException{
        try {
            String s1 = "outputFiles\\rule";
            String s2=".txt";
            File myObj = new File(s1+s2);
            int x=0;
            while(myObj.exists()) {
                x++;
                myObj = new File(s1+x+s2);
            }
            FileWriter fw = new FileWriter(myObj,true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Integer integer : a) {
                bw.write(integer + "\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static int countUrinals(String urinalString){

        int count;
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

    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Press 1. for keyboard input 2. for file input");
        String in = sc1.next();
        ArrayList<Integer> a = new ArrayList<>();
        if(in.equals("1")){
            System.out.println("Enter your urinals string");
            while(true) {
                String urinalString = getUrinalStringKeyboard();
                if(urinalString.equals("-1")){break;}
                int res = countUrinals(urinalString);
                //System.out.println(res);
                a.add(res);
            }
            for (Integer integer : a) {
                System.out.println(integer);
            }
        }
        else if(in.equals("2")){
            getUrinalStringFile();
            System.out.println("Check outputFiles folder to see the result");
        }
        else{
            System.out.println("Wrong input");
        }

    }
}

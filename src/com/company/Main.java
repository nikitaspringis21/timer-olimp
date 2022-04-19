package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("a.out.txt");
        FileReader fr = new FileReader("a.in.txt");
        Scanner sc = new Scanner(fr);
        //System.out.println(sc.nextLine());


        String stroka = sc.nextLine();
        int i = stroka.length()-1;
        int j = 0;
        Character symbol;
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int k = i;

        symbol = stroka.charAt(k);
        while(!symbol.equals(':') && k != 0){
            symbol = stroka.charAt(k);
            seconds += Character.getNumericValue(symbol) * Math.pow(10, j);
            j++;
            if(k == 0) break;
            k--;
            symbol = stroka.charAt(k);
        }
        k--;
        j = 0;
        symbol = '0';
        while(!symbol.equals(':') && k != 0) {
            symbol = stroka.charAt(k);
            //System.out.println(symbol);
            minutes += Character.getNumericValue(symbol) * Math.pow(10, j);
            j++;
            k--;
            symbol = stroka.charAt(k);
        }
        j = 0;
        k--;
        symbol = '0';
        while(!symbol.equals(':')){
            symbol = stroka.charAt(k);
            hours += Character.getNumericValue(symbol) * Math.pow(10, j);
            j++;
            if(k == 0) break;
            k--;
            symbol = stroka.charAt(k);
        }


        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);

    }
}

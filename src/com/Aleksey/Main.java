package com.Aleksey;
        import java.io.*;
        import java.util.*;
        import java.text.*;


public class Main {

    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);
        System.out.println("sentences, we need sentences");
        String predl = p.nextLine();
        int count = 0;

        if(predl.length() != 0){
            count++;
            for (int i = 0; i < predl.length(); i++) {
                if(predl.charAt(i) == ' ' || predl.charAt(i) == ','){
                    count++;
                }
            }
        }

        char[] naisu = predl.toCharArray();
        Arrays.sort(naisu);
        String sorted = new String(naisu);

        System.out.println("sentence: " + predl + ". count of words " + count + ". sorting " + sorted);
    }
}
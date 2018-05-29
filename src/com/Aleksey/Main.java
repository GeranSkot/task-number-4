package com.Aleksey;
        import java.io.*;
        import java.util.*;
        import java.text.*;

public class Main {

    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String pr = p.nextLine();
        int count = 0;
        if(pr.length() != 0){
            count++;
            for (int i = 0; i < pr.length(); i++) {
                if(pr.charAt(i) == ' ' || pr.charAt(i) == ','){
                    count++;
                }
            }
        }
        char[] na = pr.toCharArray();
        Arrays.sort(na);
        String sorted = new String(na);
        System.out.println("sentence: " + pr + ". count of words " + count + ". sorting " + sorted);
    }
}
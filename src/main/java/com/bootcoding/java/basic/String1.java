package com.bootcoding.java.basic;
import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
      String  name ="shreya";
      int value = name.length();
       System.out.println(name);
       System.out.println(value);
       String Ustring = name.toUpperCase();

       System.out.println(Ustring);
       String Lstring = name.toLowerCase();
       System.out.println(Lstring);
       String nontrimmedstring = "       shreya   ";
       System.out.println(nontrimmedstring);
       String trimmedstring =  nontrimmedstring.trim();
       System.out.println(nontrimmedstring.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,5));

    }
}

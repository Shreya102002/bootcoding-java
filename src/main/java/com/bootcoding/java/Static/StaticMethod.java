package com.bootcoding.java.Static;

public class StaticMethod{
 static  int a=10;
 static String b="shreya";
 static boolean c = true;
 int e = 5;

 static {
  System.out.println("Hey you");
 }

 public static void main(String[] args) {
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);

  StaticMethod st = new StaticMethod();
   st.printElements();
  System.out.println(st.e);

 }

  static {
      System.out.println("Hello World");
  }
   void printElements(){
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   display();
 }
 public static void display(){
     System.out.println(a + b);
     System.out.println(b);
 }




 static
 {

  System.out.println(
          "Hey Shreya Awaj aa rhi hai kyaa haaaaaaaa okkk coollll"
  );
 }
 }




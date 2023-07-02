package com.bootcoding.java.Example;

public class Remote {

        String brand;
        String color;
        double price;
        public void print(){
            System.out.println("Color:"+ color);
            System.out.println("Brand:"+ brand);
            System.out.println("Price:"+ price);
        }
        public Remote(){

        }
        public Remote(String brand,String colour,double price){
        this.brand=brand;
        this.color=colour;
        this.price=price;
        }
        public static void main (string args[]){
            for(int i=0;i<500;i++){
                System.out.println(i +1);
                creatRemote("white",95.00);
            }

        }

        public static void creatRemote(String color, double price){

        }
}


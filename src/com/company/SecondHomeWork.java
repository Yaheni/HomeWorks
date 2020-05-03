package com.company;

public class SecondHomeWork{

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 7, 5.6, "black");
        barsik.showCatInfo();
    }
}
class Cat{

    private String name;
    private int age;
    private double weight;
    private String color;

    Cat(String name, int age, double weight, String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    void showCatInfo(){
        System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Weight: " + weight + "\n" + "Color: " + color);
    }
}
package com.company;
import java.util.Scanner;

public class ThirdHomeWorkTaskTwo {

    public static class Flowers {

        String type;
        int count;
        int price;
        int totalPrice;

        public Flowers(String type, int count, int price) {
            this.type = type;
            this.count = count;
            this.price = price;
            this.totalPrice = price * count;
        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество роз в букете:");
            String countOfRoses = in.nextLine();
            System.out.println("Введите количество тюльпанов в букете:");
            String countOfTulips = in.nextLine();
            System.out.println("Введите количество ромашек в букете:");
            String countOfDaisies = in.nextLine();

            Flowers Roses = new Flowers("Roses", Integer.parseInt(countOfRoses), 8);
            Flowers Tulips = new Flowers("Tulips", Integer.parseInt(countOfTulips), 6);
            Flowers Daisies = new Flowers("Daisies", Integer.parseInt(countOfDaisies), 4);
            int totalPriceForAll = Roses.totalPrice + Tulips.totalPrice + Daisies.totalPrice;

            System.out.println("Вы собрали следующий букет: " + "\n" + Roses.type + " - " + Roses.count + "\n" + Tulips.type + " - " + Tulips.count + "\n" + Daisies.type + " - " + Daisies.count + "\n" + "Итого: " + totalPriceForAll + "p.");

        }

    }
}

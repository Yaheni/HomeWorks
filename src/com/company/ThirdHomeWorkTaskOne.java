package com.company;

public class ThirdHomeWorkTaskOne {


    public static int generateRandomNumber (int maxNum) {
        int number = new java.util.Random().nextInt(maxNum);
        return number;

    }

    public static void getMaxDigit (int num) {
        String str = Integer.toString(num);
        char[] digits = str.toCharArray();
        if (digits.length == 3 && digits[0] >= digits[1] && digits[0] >= digits[2]) {
            System.out.println("Наибольшая цифра из числа " + num + " : " + digits[0]);
        }
        else if (digits.length == 3 && digits[1] >= digits[0] && digits[1] >= digits[2]) {
            System.out.println("Наибольшая цифра из числа " + num + " : " +  digits[1]);
        }
        else if (digits.length == 3){
            System.out.println("Наибольшая цифра из числа " + num + " : " +  digits[2]);
        }
        //если сгенерировалось 2-ух значное или 1-значное число
        else if (digits.length == 2 && digits[0] > digits[1]) {
            System.out.println("Наибольшая цифра из числа " + num + " : " +  digits[0]);
        }
        else if (digits.length == 2) {
            System.out.println("Наибольшая цифра из числа " + num + " : " +  digits[1]);
        }
        else {
            System.out.println("Наибольшая цифра из числа " + num + " : " +  digits[0]);
        }
    }

    public static void printSumOfDigits (int num) {
        String str = Integer.toString(num);
        char[] digits = str.toCharArray();
        if (digits.length == 3) {
           int result = Character.getNumericValue(digits[0]) + Character.getNumericValue(digits[1]) + Character.getNumericValue(digits[2]);
            System.out.println("Cумма всех цифр числа " + num + " : " +  result);
        }
        else if (digits.length == 2) {
            int result = Character.getNumericValue(digits[0]) + Character.getNumericValue(digits[1]);
            System.out.println("Cумма всех цифр числа " + num + " : " +  result);
        }
        else {
            System.out.println("Число " + num + " однозначное!");
        }

    }

    public static void main(String[] args) {

     int initialValue = 999;
     getMaxDigit(generateRandomNumber(initialValue));
     printSumOfDigits(generateRandomNumber(initialValue));

    }
}

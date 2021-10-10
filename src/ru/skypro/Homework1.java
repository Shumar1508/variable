package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte one = 1;
        System.out.println(one);
        short two = 2;
        System.out.println(two);
        int three = 3;
        System.out.println(three);
        long four = 4L;
        System.out.println(four);
        float five = 5.1f;
        System.out.println(five);
        double six = 5.2;
        System.out.println(six);

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float totalWeight = boxer1 + boxer2;
        float difference = boxer2 - boxer1;
        System.out.println("Общий вес " + totalWeight + " кг. " + "Разница " + difference + " кг.");


        int bananas = 5;
        int totalAmountOfBananas = bananas * 80;
        int milk = 200/100;
        int grMilk = milk * 105;
        int ice = 2;
        int twoBriquettes = ice * 100;
        int egg = 4;
        int grEgg = egg * 70;
        int breakfastWeight = totalAmountOfBananas + grMilk + twoBriquettes + grEgg;
        int grInKg = 1_000;
        float oneKg = 1.0f;
        float amountInKg = (breakfastWeight * oneKg) / grInKg;
        System.out.println("Общий вес в гр " + breakfastWeight + ". Общий вес в кг " + amountInKg + ".");

        int reset = 7;
        int gramm = 1_000;
        int kgInGr = reset * gramm;
        int rationOne = 250;
        int rationTwo = 500;
        int ratOne = kgInGr / rationOne;
        int ratTwo = kgInGr / rationTwo;
        int average = (ratOne + ratTwo) / 2;
        System.out.println("Если по 250 гр " + ratOne + " дней. " + "Если по 500 гр " + ratTwo + " дней. " + "В среднем понадобится " + average + " день");

        int masha = 67_760;
        float raising = 0.1f;
        int year = 12;
        float mashaRaising = (masha * raising) + masha;
        int denis = 83_690;
        float denisRaising = (denis * raising) + denis;
        int kristina = 76_230;
        float kristinaRaising = (kristina * raising) + kristina;
        float yearMAfter = mashaRaising * year;
        float yearDAfter = denisRaising * year;
        float yearKAfter = kristinaRaising * year;
        int yearMBefore = masha * year;
        int yearDBefore = denis * year;
        int yearKBefore = kristina * year;
        float differenceM = yearMAfter - yearMBefore;
        float differenceD = yearDAfter - yearDBefore;
        float differenceK = yearKAfter - yearKBefore;
        System.out.println("Маша теперь получает " + mashaRaising + " рублей" + ". Годовой доход вырос на " + differenceM + " рублей.");
        System.out.println("Денис теперь получает " + denisRaising + " рублей" + ". Годовой доход вырос на " + differenceD + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaRaising + " рублей" + ". Годовой доход вырос на " + differenceK + " рублей.");




















    }
}

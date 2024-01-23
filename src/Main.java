public class Main {
    public static void main(String[] args) {
        //task1 -
        int varInt = 2000000;
        System.out.println("Значение переменной varInt, с типом int равно: " + varInt);
        byte varByte = -22;
        System.out.println("Значение переменной varByte, с типом byte равно: " + varByte);
        short varShort = 22000;
        System.out.println("Значение переменной varShort, с типом short равно: " + varShort);
        long varLong = 20000000;
        System.out.println("Значение переменной varLong, с типом long равно: " + varLong);
        float varFloat = -2.022f;
        System.out.println("Значение переменной varFloat, с типом float равно: " + varFloat);
        double varDouble = 2.22022;
        System.out.println("Значение переменной varDouble, с типом double равно: " + varDouble);

        //task2
        float varFloat2 = 27.12f;
        long varLong2 = 987678965549L;
        String varChar = "2,786";
        short varShort2 = 569;
        short varShort3 = -159;
        char varChar2 = 27897;
        byte carByte2 = 67;

        //task3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short totalSheet = 480;
        int allStud = lP + aS + eA;
        int everStud = totalSheet / allStud;
        System.out.println("На каждого ученика рассчитано " + everStud + " листов бумаги");

        //task4
        byte totalBottle = 16;
        int totalBottle20 = totalBottle * 10;
        System.out.println("За 20 минут машина произвела " + totalBottle20 + " бутылок");
        int totalBottleDay = totalBottle20 * 3 * 24;
        System.out.println("За сутки машина произвела " + totalBottleDay + " бутылок");
        int totalBottle3Day = totalBottleDay * 3;
        System.out.println("За трое суток машина произвела " + totalBottle3Day + " бутылок");
        int totalMonth = totalBottleDay * 30;
        System.out.println("За месяц машина произвела " + totalMonth + " бутылок");

        //task5
        byte repairSchool = 120;
        byte totalColorOneClass = 6;
        byte brown = 4;
        byte white = 2;
        int totalClass = repairSchool / totalColorOneClass;
        int totalBrown = totalClass * brown;
        int totalWhite = totalClass * white;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

        //task6
        short bananasWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 * 100;
        short eggs = 4 * 70;
        int breakfastG = bananasWeight + milkWeight + iceCreamWeight + eggs;
        float breakfastKg = (float) breakfastG / 1000;
        System.out.println("Завтрак в граммах: " + breakfastG + ", в килограммах: " + breakfastKg);

        //task7
        byte termLostWeight = 7;
        float perDayKg250 = (float) 250 / 1000;
        float lossWeightDayCount250 = termLostWeight / perDayKg250;
        System.out.println("Похдение по 250г, займёт: " + lossWeightDayCount250 + " дней");
        float perDayKg500 = (float) 500 / 1000;
        float lossWeightDayCount500 = termLostWeight / perDayKg500;
        System.out.println("Похдение по 500г, займёт: " + lossWeightDayCount500 + " дней");
        float middleLostWeight = (lossWeightDayCount250 + lossWeightDayCount500) / 2;
        System.out.println("Среднепохудение займёт: " + middleLostWeight + " день");

        //task8
        int mashaIncome = 67760;
        int denisIncome = 83690;
        int kristinaIncome = 76230;
        int mashaIncomeMonth = (mashaIncome * 10) / 100 + mashaIncome ;
        int denisIncreaseMonth = (denisIncome * 10) / 100 + denisIncome ;
        int kristinaIncreaseMonth = (kristinaIncome * 10) / 100 + kristinaIncome;
        int mashaIncreaseYear = mashaIncomeMonth * 12;
        int denisIncreaseYear = denisIncreaseMonth * 12;
        int kristinaIncreaseYear = kristinaIncreaseMonth *12;
        int mashaIncomeDifferenceYear = mashaIncreaseYear - mashaIncome * 12;
        int denisIncomeDifferenceYear = denisIncreaseYear - denisIncome * 12;
        int kristinaIncomeDifferenceYear = kristinaIncreaseYear - kristinaIncome * 12;
        System.out.println("Маша теперь получает " + mashaIncomeMonth + " рублей. Годовой доход вырос на " + mashaIncomeDifferenceYear+ " рублей." );
        System.out.println("Денис теперь получает " + denisIncreaseMonth + " рублей. Годовой доход вырос на " + denisIncomeDifferenceYear+ " рублей." );
        System.out.println("Кристина теперь получает " + kristinaIncreaseMonth + " рублей. Годовой доход вырос на " + kristinaIncomeDifferenceYear + " рублей." );
    }
}
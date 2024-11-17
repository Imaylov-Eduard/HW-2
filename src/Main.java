public class Main {
    public static void main(String[] args) {


        System.out.println("Задание№1");

        int a = 50000;
        byte b = 100;
        short c = 20000;
        long d = 100000;
        float i = 58.30f;
        double f = 65.50d;
        System.out.println("Значение переменной c типом int равно " + a);
        System.out.println("Значение переменной c типом byte равно " + b);
        System.out.println("Значение переменной c типом short равно " + c);
        System.out.println("Значение переменной c типом long равно " + d);
        System.out.println("Значение переменной c типом float равно " + i);
        System.out.println("Значение переменной c типом double равно " + f);


        System.out.println("Задание№2");

        float one = 27.12F;
        long two = 987678965549L;
        double three = 2.786;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
        System.out.println("Значение переменной c типом float равно " + one);
        System.out.println("Значение переменной c типом long равно " + two);
        System.out.println("Значение переменной c типом double равно " + three);
        System.out.println("Значение переменной c типом short равно " + four);
        System.out.println("Значение переменной c типом short равно " + five);
        System.out.println("Значение переменной c типом short равно " + six);
        System.out.println("Значение переменной c типом byte равно " + seven);


        System.out.println("Задание№3");

        byte totalPupilsLudmilaPavlovna = 23;
        byte totalPupilslAnnaSergeyevna = 27;
        byte totalPupilsEkaterinaAndreyevna = 30;
        short totalPaper = 480;
        int allStudents = totalPupilsLudmilaPavlovna + totalPupilslAnnaSergeyevna + totalPupilsEkaterinaAndreyevna;
        int sheetsEach = totalPaper / allStudents;
        System.out.println("На каждого ученика расчитано " + sheetsEach + " листов бумаги");


        System.out.println("Задание№4");

        byte bottles2minutes = 16;
        int bottles1minutes = bottles2minutes / 2;
        int bottles20minutes = bottles1minutes * 20;
        int bottlesPerDay = bottles1minutes * 60 * 24;
        int bottlesIn3Days = bottlesPerDay * 3;
        int bottlesIn1Month = bottlesPerDay * 30;
        System.out.println("За 20 минут машина произвела " + bottles20minutes + " штук бутылок.");
        System.out.println("За 1 сутки машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " штук бутылок.");

        System.out.println("Задание№4 вариант2");

        byte bottles2minutes1 = 16;
        int bottles20minutes1 = bottles2minutes1 * 10;
        int bottlesPerDay1 = bottles20minutes1 * 3 * 24;
        int bottlesIn3Days1 = bottlesPerDay1 * 3;
        int bottlesIn1Month1 = bottlesIn3Days1 * 10;
        System.out.println("За 20 минут машина произвела " + bottles20minutes1 + " штук бутылок.");
        System.out.println("За 1 сутки машина произвела " + bottlesPerDay1 + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days1 + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month1 + " штук бутылок.");

        System.out.println("Задание№5");

        byte totalCans = 120;
        byte whiteOnOneClass = 2;
        byte brownsAtOneClass = 4;
        int allTheColorsForOneClass = whiteOnOneClass + brownsAtOneClass;
        int totalClasses = totalCans / allTheColorsForOneClass;
        int totalWhitePaint = totalClasses * whiteOnOneClass;
        int totalBrownsPaint = totalClasses * brownsAtOneClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски " + "и " + totalBrownsPaint + " банок коричневой краски ");

        System.out.println("Задание№6");

        int theWeightOf5Bananas = 5 * 80;
        int weightOf200MlOfMilk = 105 * 2;
        int weightOf2IceCreams = 100 * 2;
        int weightOf4Eggs = 70 * 4;
        double gramPerKilogram = 1000;
        int gramWeight = theWeightOf5Bananas + weightOf200MlOfMilk + weightOf2IceCreams + weightOf4Eggs;
        double kilogramWeight = gramWeight / gramPerKilogram;
        System.out.println("Вес завтрака " + gramWeight + " грамм или " + kilogramWeight + " килограмма ");

        System.out.println("Задание №7");

        int dropAGram = 7000;
        int lossesPerDay1 = 250;
        int lossesPerDay2 = 500;
        int daysToLoseWeight1 = dropAGram / lossesPerDay1;
        int daysToLoseWeight2 = dropAGram / lossesPerDay2;
        int averageDays = ((daysToLoseWeight1 + daysToLoseWeight2) / 2);
        System.out.println("Если спортсмен сбрасывает в день от " + lossesPerDay1 + " грамм до " + lossesPerDay2 + " грамм , то в среднем " + averageDays + " день ему понадобится для достижения результата");

        System.out.println("Задание№8");

        int monthlySalaryM = 67760;
        int monthlySalaryD = 83690;
        int monthlySalaryK = 76230;
        int afterSurchargeM = monthlySalaryM + ((monthlySalaryM / 100) * 10);
        int afterSurchargeD = monthlySalaryD + ((monthlySalaryD / 100) * 10);
        int afterSurchargeK = monthlySalaryK + ((monthlySalaryK / 100) * 10);
        int aYearWasM = monthlySalaryM * 12;
        int aYearWasD = monthlySalaryD * 12;
        int aYearWasK = monthlySalaryK * 12;
        int yearBecameM = afterSurchargeM * 12;
        int yearBecameD = afterSurchargeD * 12;
        int yearBecameK = afterSurchargeK * 12;
        int yearDifferenceM = yearBecameM - aYearWasM;
        int yearDifferenceD = yearBecameD - aYearWasD;
        int yearDifferenceK = yearBecameK - aYearWasK;
        System.out.println("Маша теперь получает " + afterSurchargeM + " рублей. Годовой доход вырос на " + yearDifferenceM +  " рублей.");
        System.out.println("Денис теперь получает " + afterSurchargeD + " рублей. Годовой доход вырос на " + yearDifferenceD +  " рублей.");
        System.out.println("Кристина теперь получает " + afterSurchargeK + " рублей. Годовой доход вырос на " + yearDifferenceK +  " рублей.");
    }
}


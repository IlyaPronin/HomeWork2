public class Main {
    public static void main(String[] args) {
        byte a = 5;
        short b = 100;
        int c = 495;
        long d = 359L;
        float e = 3.5f;
        double f = 2.95;
        System.out.println("A= " + a + ", B= " + b + ", C= " + c + ", D= " + d + ", E= " + e + ", F= " + f);

        double boxerOneWeight = 78.2;
        double boxerTwoWeight = 82.7;
        double totalBoxerWeight = boxerOneWeight + boxerTwoWeight;
        double differenceWeight = (totalBoxerWeight - boxerOneWeight) % boxerOneWeight;
        System.out.println("Общий вес боксров = " + totalBoxerWeight + " кг!");
        System.out.println("Разница в весе боксеров = " + differenceWeight + "кг!");

        int bananas = 5;
        int bananasCalories = bananas * 80;
        int milk = 200;
        int milkCalories = (milk / 100) * 105;
        int iceCream = 2;
        int iceCreamCalories = iceCream * 100;
        int egg = 4;
        int eggCalories = egg * 70;
        int dietWeight = bananasCalories + milkCalories + iceCreamCalories + eggCalories;
        double dietWeightKillo = dietWeight * 0.001;
        System.out.println("Вес завтрака боксёра = " + dietWeight + " грамм! Или " + dietWeightKillo + " килограмм!");


        int boxerMustLoseWeight = 7;
        int boxerLoseWeight1 = (boxerMustLoseWeight * 1000) / 250;
        int boxerLoseWeight2 = (boxerMustLoseWeight * 1000) / 500;
        int averageDay = (boxerLoseWeight1 + boxerLoseWeight2)/2;
        System.out.println("На первый вариант диеты уйдёт - " + boxerLoseWeight1 + " дней, а на второй вариант - " + boxerLoseWeight2 + " дней!" +
                "А в среднем спортсмен будет худеть - " + averageDay + " день!");

//        Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
//        В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
//        Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
//        Каждый год повышение составляет 10% от текущей зарплаты.
//
//        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
//        Маша получает 67 760 рублей в месяц
//        Денис получает 83 690 рублей в месяц
//        Кристина получает 76 230 рублей в месяц
//        Каждому нужно увеличить зарплату на 10% от текущей месячной.
//        Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
//        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
//      Выведите в консоль информацию по каждому сотруднику.
//        Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.

        var salaryEmployees=0;
        var salaryMasha= 67760;
        salaryEmployees = salaryMasha;
       var salaryIndex = salaryEmployees+(salaryEmployees*0.1);
       var incomeGrowthMasha=salaryEmployees*0.1*12;
        System.out.println("Маша теперь получает "+salaryIndex+ " рублей. Годовой доход вырос на "+incomeGrowthMasha+" рублей.");

       var salaryDen= 83690;
        salaryEmployees = salaryDen;
        var salaryIndexDen = salaryEmployees+(salaryEmployees*0.1);
        var incomeGrowthDen=salaryEmployees*0.1*12;
        System.out.println("Денис теперь получает "+salaryIndexDen+ " рублей. Годовой доход вырос на "+incomeGrowthDen+" рублей.");

       var salaryKris= 76230;
        salaryEmployees = salaryKris;
        var salaryIndexKris = salaryEmployees+(salaryEmployees*0.1);
        var incomeGrowthKris =salaryEmployees*0.1*12;
        System.out.println("Кристина теперь получает "+salaryIndexKris+ " рублей. Годовой доход вырос на "+incomeGrowthKris+" рублей.");
    }
}
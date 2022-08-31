public class Main {

    // Домашнее задание 5
    public static void Task1() {

        //Задание 1

        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию придожения для iOS по ссылке.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
            default:
                System.out.println("Такай операционной системы нет.");
        }
        System.out.println();
    }

    public static void Task2() {

        //Задание 2

        int yearOfIssue = 2015;
        int clientOS = 1;

        if (yearOfIssue >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию придожения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке.");
                    break;
                default:
                    System.out.println("Такай операционной системы нет.");

            }

            System.out.println();

        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию придожения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                    break;
                default:
                    System.out.println("Такай операционной системы нет.");
            }

        }
        System.out.println();
    }

    public static void Task3() {

        // задание 3

        int year = 9;
        boolean everyFourthYear = (year % 4) == 0;
        boolean everyFourHundredthYear = (year % 400) == 0;
        if (everyFourthYear || everyFourHundredthYear) {
            System.out.println(year + " год является весокосным");
        } else {
            System.out.println(year + " год не является весокосным");
        }
        System.out.println();
    }

    public static void Task4() {

        //Задание 4

        int day = 1;
        int deliveryDistance = 65;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        }
        System.out.println();
    }

    public static void Task5() {

        //Задание 5

        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц (январь) относится к зимнему сезону.");
                break;
            case 2:
                System.out.println(monthNumber + " месяц (февраль) относится к зимнему сезону.");
                break;
            case 3:
                System.out.println(monthNumber + " месяц (март) относится к весеннему сезону.");
                break;
            case 4:
                System.out.println(monthNumber + " месяц (апрель) относится к весеннему сезону.");
                break;
            case 5:
                System.out.println(monthNumber + " месяц (май) относится к весеннему сезону.");
                break;
            case 6:
                System.out.println(monthNumber + " месяц (июнь) относится к летнему сезону.");
                break;
            case 7:
                System.out.println(monthNumber + " месяц (июль) относится к летнему сезону.");
                break;
            case 8:
                System.out.println(monthNumber + " месяц (август) относится к летнему сезону.");
                break;
            case 9:
                System.out.println(monthNumber + " месяц (сентябрь) относится к осеннему сезону.");
                break;
            case 10:
                System.out.println(monthNumber + " месяц (октябрь) относится к осеннему сезону.");
                break;
            case 11:
                System.out.println(monthNumber + " месяц (ноябрь) относится к осеннему сезону.");
                break;
            case 12:
                System.out.println(monthNumber + " месяц (декабрь) относится к зимнему сезону");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

}
public class Main {
    public static void main(String[] args) {
    byte clientOS = 1;
    int  clientDeviceYear = 2015;
    int year = 2021;
    int deliveryDistance = 95;
    byte days = 1;
    char monthNumber = 12;



    if (clientDeviceYear < 2015 && clientOS == 0) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }
    else if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }

    if (clientDeviceYear < 2015 && clientOS == 1){
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    else if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }





    if (year < 1584){
        System.out.println(year + " год не является високосным");
    }
    else if (year % 100 == 0 && year % 400 != 0 || year % 4 != 0){
        System.out.println(year + " год не является високосным");
    }
    else if (year % 4 == 0 || year % 400 == 0){
        System.out.println(year + " год является високосным");
    }




    if (deliveryDistance < 20){
        System.out.println("Потребуется дней: " + days);
    }
    else if (deliveryDistance < 60){
        int upDays = days + 1;
        System.out.println("Потребуется дней: " + upDays);
    }
    else if (deliveryDistance < 100){
        int upDays = days + 2;
        System.out.println("Потребуется дней: " + upDays);
    }
    else {
        System.out.println("Доставки нет");
    }

    if (monthNumber <= 12) {
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
        }
    }
    else {
        System.out.println("Номер месяца больше возможного");
    }
    }
}
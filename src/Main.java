public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {
        System.out.println("task 1");
        int clientOs = 1;
        if (clientOs < 1) {
            System.out.println("Install the IOS version of the app by following the link");
        } else {
            System.out.println("Install the Android version of the app by following the link");
        }
    }

    public static void task2() {
        System.out.println("task 2");
        int clientOs = 0;
        int clientDeviceYear = 2014;
        if (clientOs == 0 && clientDeviceYear <= 2014) {
            System.out.println("Install the lite version of the iOS app by following the link");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Install the IOS version of the app by following the link");
        }
        if (clientOs == 1 && clientDeviceYear <= 2014) {
            System.out.println("Install the lite version of the Android app by following the link");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Install the Android version of the app by following the link");
        }

    }

    public static void task3() {
        System.out.println("task 3");
        int year = 2032;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("year is leap");
        } else {
            System.out.println("year isn't leap");


        }


    }

    public static void task4() {
        System.out.println("task 4");
        int deliveryDistance = 50;
        int deliveryOne = 1;
        int deliveryTwo =2;
        int deliveryThree = 3;

        if (deliveryDistance <= 20) {
            System.out.println("need day: " + deliveryOne);
        } else if (deliveryDistance > 20 && deliveryDistance <=60){
            System.out.println("need days: " + deliveryTwo);

        }else if (deliveryDistance > 60 && deliveryDistance <=100 ){
            System.out.println("need days " + deliveryThree);

        }else if (deliveryDistance > 100) {
            System.out.println("no delivery!!!");

        }
    }


    public static void task5() {
        System.out.println("task 5");
        int monthNumber = 7;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("winter!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn!");
            default:
                System.out.println("number of month bigger 12");
        }


    }
}


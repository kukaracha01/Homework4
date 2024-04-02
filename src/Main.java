public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task2");
        int teamperature = -12;
        if (teamperature < 5) {
            System.out.println("На улице " + teamperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + teamperature + " градусов, можно идти без шапки");

        }

        System.out.println("Task3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println("Task4");
        int newAge = 19;
        if (newAge >= 2 && newAge <= 6) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить в детский сад");
        }
        if (newAge >= 7 && newAge <= 17) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить в школу");
        }
        if (newAge >= 18 && newAge <= 24) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить на работу");
        }

        System.out.println("Task5");


    }




}

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
        int newAge = 25;
        if (newAge >= 2 && newAge <= 6) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить в детский сад");
        }
        if (newAge >= 7 && newAge <= 17) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить в школу");
        }
        if (newAge >= 18 && newAge <= 24) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить в университет");
        }
        else if (newAge > 24) {
            System.out.println("Если возраст человека равен " + newAge + ", то ему нужно ходить на работу");
        }

        System.out.println("Task5");
        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");

        }
        if (ageChild <= 14 && ageChild >=5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься в сопровождении взрослых");
        } else if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься без сопровождения взрослых");
        }

        System.out.println("Task6");
        int totalPlaces = 102;
        int seatingPlacesInCarriage = 60;
        int standingPlacesInCarriage = totalPlaces - seatingPlacesInCarriage;
        int peopleInCarriageNow = 103;
        if (peopleInCarriageNow >= seatingPlacesInCarriage && peopleInCarriageNow <= totalPlaces) {
            int standingPlacesInCarriageNow = totalPlaces - peopleInCarriageNow;
            System.out.println("В вагоне осталось "  + standingPlacesInCarriageNow + " стоячих места");
        }
        if (peopleInCarriageNow < seatingPlacesInCarriage) {
            int seatingPlacesInCarriageNow = seatingPlacesInCarriage - peopleInCarriageNow;
            System.out.println("В вагоне осталось " + seatingPlacesInCarriageNow + " сидячих мест и " + standingPlacesInCarriage + " стоячих мест");
        }
        else {
            System.out.println("Вагон полностью забит");
        }







    }




}


public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1
        // Задание №1
        System.out.println("Домашнее задание - 1");
        System.out.println("Задание №1");

    int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю, ты уже такой большой!");}
        if (age < 18) {
            System.out.println("Скоро подрастешь!!");}

        // Задание №2
        System.out.println("Задание №2");
        int age2 = 18;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Твой сын еще ходит в школу");}
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Твой ребенок уже эге-ге, он закончил школу и может отправляться в университет");}
        if (age2 >= 24) {
            System.out.println("Твоя сынуля уже окончил университет, пора на работку!");}

        // Задание №3
        System.out.println("Задание №3");
        int capacity = 102;
        int seating = 60;
        int standing = capacity - seating;
        int seatingnow = 20;
        int standingnow = 20;
        if (seatingnow<seating) {
            System.out.println("Есть еще " + (seating-seatingnow) + " сидячих мест");}
        if (standingnow<standing) {
            System.out.println("Есть еще " + (standing-standingnow) + " стоячих мест");}

        // Домашнее задание - 2
        // Задание №1
        System.out.println("Домашнее задание - 2");
        System.out.println("Задание №1");
        int ages = 17;
        if (ages >= 18) {
            System.out.println("Поздравляю, ты уже такой большой!");}
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать!!");}

        // Задание №2
        System.out.println("Задание №2");
        int ages2 = 18;
        if (ages2 >= 7 && ages2 < 18) {System.out.println("Твой сын еще ходит в школу");}
        if (ages2 >= 18 && ages2 < 24) {System.out.println("Твой ребенок уже эге-гей, он закончил школу и может отправляться в университет");}
        else {System.out.println("Твоя сынуля уже окончил университет, пора на работку!");}

        // Задание №3
        System.out.println("Задание №3");
        int capacity2 = 102;
        int seating2 = 60;
        int standing2 = capacity2 - seating2;
        int seatingnow2 = 20;
        int standingnow2 = 70;
        if (seatingnow2<seating2) {
            System.out.println("Есть еще " + (seating2-seatingnow2) + " сидячих мест");}
        if (standingnow2<standing2) {
            System.out.println("Есть еще " + (standing2-standingnow2) + " стоячих мест");}
        else {System.out.println("Вагон забит");}


        // Домашнее задание - 3
        // Задание №1
        System.out.println("Домашнее задание - 3");
        System.out.println("Задание №1");
        int yearsOld = 13;
        if (yearsOld >= 2 && yearsOld <= 6) {System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");}
        else if (yearsOld >= 7 && yearsOld <= 18) {System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу.");}
        else if (yearsOld > 18 && yearsOld <= 24) {System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет.");}
        else if (age > 24) {System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу.");}

        // Задание №2
        System.out.println("Задание №2");
        int yearsOld2 = 17;
        if (yearsOld2 < 5) {System.out.println("Прости, тебе пока нельзя кататься на аттракционе :(");}
        else if (yearsOld2 >= 5 && yearsOld2 < 14) {System.out.println("Тебе можно кататься только в сопровождении взрослых! Если взрослых нет, то прости, тебе нельзя на аттракцион :(");}
        else if (yearsOld2 >= 14) {System.out.println("Уряя, ты сможешь покататься!");}

        // Задание №3
        System.out.println("Задание №3");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one < two && one < free) {System.out.println("Самое маленькое число - one");}
        else if (one > two && one > free) {System.out.println("Самое большое число - one");}
        if (two < one && two < free) {System.out.println("Самое маленькое число - two");}
        else if (two > one && two > free) {System.out.println("Самое большое число - two");}
        if (free < one && free < two) {System.out.println("Самое маленькое число - free");}
        else if (free > one && free > two) {System.out.println("Самое большое число - free");}




    }
    }
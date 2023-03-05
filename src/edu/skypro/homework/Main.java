package edu.skypro.homework;

import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {

        Gryffindor harry = generateGryffStudent("Гарри Поттер");
        Gryffindor hermione = generateGryffStudent("Гермиона Грейнджер");
        Gryffindor ron = generateGryffStudent("Рон Уизли");

        Hufflepuff zechariah = generateHafflStudent("Захария Смит");
        Hufflepuff cedric = generateHafflStudent("Седрик Диггори");
        Hufflepuff justin = generateHafflStudent("Джастин Финч-Флетчли");


        Ravenclaw zhou = generateRavenStudent("Чжоу Чанг");
        Ravenclaw padma = generateRavenStudent("Падма Патил");
        Ravenclaw marcus = generateRavenStudent("Маркус Белби");


        Slytherin draco = generateSlythStudent("Драко Малфой");
        Slytherin graham = generateSlythStudent("Грэхэм Монтегю");
        Slytherin gregory = generateSlythStudent("Грегори Гойл");

        harry.info();
        cedric.info();
        marcus.info();
        draco.info();

        harry.compareStudent(ron);
        harry.compareStudent(draco);
    }

    private static Gryffindor generateGryffStudent(String fullName) {
        return new Gryffindor(
                fullName,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
                );
    }
    private static Hufflepuff generateHafflStudent(String fullName) {
        return new Hufflepuff(
                fullName,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        );
    }
    private static Ravenclaw generateRavenStudent(String fullName) {
        return new Ravenclaw(
                fullName,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        );
    }

    private static Slytherin generateSlythStudent(String fullName) {
        return new Slytherin(
                fullName,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        );
    }
}

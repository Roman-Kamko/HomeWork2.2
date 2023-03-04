package edu.skypro.homework;

import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри Поттер", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Gryffindor ron = new Gryffindor("Рон Уизли", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));

        harry.printInfo();
        Gryffindor.findBestPupil(harry, ron);

        Hufflepuff zechariah = new Hufflepuff("Захария Смит", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));

        cedric.printInfo();
        Hufflepuff.findBestPupil(cedric, justin);

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Ravenclaw padma = new Ravenclaw("Падма Патил", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));

        padma.printInfo();
        Ravenclaw.findBestPupil(padma, marcus);

        Slytherin draco = new Slytherin("Драко Малфой", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Slytherin graham = new Slytherin("Грэхэм Монтегю", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        Slytherin gregory = new Slytherin("Грегори Гойл", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));

        draco.printInfo();
        Slytherin.findBestPupil(draco, gregory);

        Hogwarts.findBestPupilInMagic(draco, harry);
        Hogwarts.findBestPupilInTeleportation(draco, harry);
    }
}

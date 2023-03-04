package edu.skypro.homework;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name,
                      int magicPower,
                      int teleportationPower,
                      int diligence,
                      int loyalty,
                      int honesty) {
        super(name, magicPower, teleportationPower);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        if (diligence >= 0 && diligence <= 100) {
            this.diligence = diligence;
        } else {
            this.diligence = 0;
        }
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty >= 0 && loyalty <= 100) {
            this.loyalty = loyalty;
        } else {
            this.loyalty = 0;
        }
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty >= 0 && honesty <= 100) {
            this.honesty = honesty;
        } else {
            this.honesty = 0;
        }
    }


    public void printInfo() {
        System.out.println(
                "Имя: " + getFullName() +
                "; Колдовство " + getMagicPower() +
                "; Трансгриссирование " + getTeleportationPower() +
                "; Трудолюбие " + diligence +
                "; Верность " + loyalty +
                "; Честь " + honesty + ";"
        );
    }
    private static int calculateCharacteristics(Hufflepuff pupil) {
        return pupil.getDiligence() + pupil.getLoyalty() + pupil.getHonesty();
    }
    static void findBestPupil(Hufflepuff firstPupil, Hufflepuff secondPupil) {
        if (calculateCharacteristics(firstPupil) > calculateCharacteristics(secondPupil)) {
            System.out.println(firstPupil.getFullName() + " лучший Пуффендуец, чем " + secondPupil.getFullName());
        } else if (calculateCharacteristics(firstPupil) == calculateCharacteristics(secondPupil)) {
            System.out.println("Способности " + firstPupil.getFullName() + " равны способностям " + secondPupil.getFullName());
        } else {
            System.out.println(secondPupil.getFullName() + " лучший Пуффендуец, чем " + firstPupil.getFullName());
        }
    }
}

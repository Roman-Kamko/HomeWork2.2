package edu.skypro.homework;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int wit;
    private int creation;

    public Ravenclaw(String name,
                     int magicPower,
                     int teleportationPower,
                     int smart,
                     int wise,
                     int wit,
                     int creation) {
        super(name, magicPower, teleportationPower);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        if (smart >= 0 && smart <= 100) {
            this.smart = smart;
        } else {
            this.smart = 0;
        }
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        if (wise >= 0 && wise <= 100) {
            this.wise = wise;
        } else {
            this.wise = 0;
        }
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (wit >= 0 && wit <= 100) {
            this.wit = wit;
        } else {
            this.wit = 0;
        }
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        if (creation >= 0 && creation <= 100) {
            this.creation = creation;
        } else {
            this.creation = 0;
        }
    }

    public void printInfo() {
        System.out.println(
                "Имя: " + getFullName() +
                "; Колдовство " + getMagicPower() +
                "; Трансгриссирование " + getTeleportationPower() +
                "; Ум " + smart +
                "; Мудрость " + wise +
                "; Остроумие " + wit +
                "; Творчество " + creation + ";"
        );
    }
    private static int calculateCharacteristics(Ravenclaw pupil) {
        return pupil.getSmart() + pupil.getWise() + pupil.getWit() + pupil.getCreation();
    }
    static void findBestPupil(Ravenclaw firstPupil, Ravenclaw secondPupil) {
        if (calculateCharacteristics(firstPupil) > calculateCharacteristics(secondPupil)) {
            System.out.println(firstPupil.getFullName() + " лучший Когтевранец, чем " + secondPupil.getFullName());
        } else if (calculateCharacteristics(firstPupil) == calculateCharacteristics(secondPupil)) {
            System.out.println("Способности " + firstPupil.getFullName() + " равны способностям " + secondPupil.getFullName());
        } else {
            System.out.println(secondPupil.getFullName() + " лучший Когтевранец, чем " + firstPupil.getFullName());
        }
    }
}

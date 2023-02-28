package edu.skypro.homework;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name,
                     int magicPower,
                     int teleportationPower,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int lustForPower) {
        super(name, magicPower, teleportationPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (cunning >= 0 && cunning <= 100) {
            this.cunning = cunning;
        } else {
            this.cunning = 0;
        }
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination >= 0 && determination <= 100) {
            this.determination = determination;
        } else {
            this.determination = 0;
        }
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition >= 0 && ambition <= 100) {
            this.ambition = ambition;
        } else {
            this.ambition = 0;
        }
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness >= 0 && resourcefulness <= 100) {
            this.resourcefulness = resourcefulness;
        } else {
            this.resourcefulness = 0;
        }
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower >= 0 && lustForPower <= 100) {
            this.lustForPower = lustForPower;
        } else {
            this.lustForPower = 0;
        }
    }


    public void printInfo() {
        System.out.println(
                "Имя: " + getFullName() +
                "; Колдовство " + getMagicPower() +
                "; Трансгриссирование " + getTeleportationPower() +
                "; Хитрость " + cunning +
                "; Решительность " + determination +
                "; Амбициозность " + ambition +
                "; Находчивость " + resourcefulness +
                "; Жажда власти " + lustForPower + ";"
        );
    }
    private static int calculateCharacteristics(Slytherin pupil) {
        return pupil.getCunning() + pupil.getDetermination() + pupil.getAmbition() + pupil.getResourcefulness() + pupil.getLustForPower();
    }

    static void findBestPupil(Slytherin firstPupil, Slytherin secondPupil) {
        if (calculateCharacteristics(firstPupil) > calculateCharacteristics(secondPupil)) {
            System.out.println(firstPupil.getFullName() + " лучший Слизеринец, чем " + secondPupil.getFullName());
        } else if (calculateCharacteristics(firstPupil) == calculateCharacteristics(secondPupil)) {
            System.out.println("Способности " + firstPupil.getFullName() + " равны способностям " + secondPupil.getFullName());
        } else {
            System.out.println(secondPupil.getFullName() + " лучший Слизеринец, чем " + firstPupil.getFullName());
        }
    }
}

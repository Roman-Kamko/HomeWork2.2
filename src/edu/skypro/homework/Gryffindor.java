package edu.skypro.homework;

public class Gryffindor extends Hogwarts {
    private int generosity;
    private int honor;
    private int bravery;

    public Gryffindor(String name,
                      int magicPower,
                      int teleportationPower,
                      int generosity,
                      int honor,
                      int bravery) {
        super(name, magicPower, teleportationPower);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getGenerosity() {
        return generosity;
    }

    public void setGenerosity(int generosity) {
        if (generosity >= 0 && generosity <= 100) {
            this.generosity = generosity;
        } else {
            this.generosity = 0;
        }
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor >= 0 && honor <= 100) {
            this.honor = honor;
        } else {
            this.honor = 0;
        }
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery >= 0 && bravery <= 100) {
            this.bravery = bravery;
        } else {
            this.bravery = 0;
        }
    }

    public void printInfo() {
        System.out.println(
                "Имя: " + getFullName() +
                "; Колдовство " + getMagicPower() +
                "; Трансгриссирование " + getTeleportationPower() +
                "; Благородство " + generosity +
                "; Честь " + honor +
                "; Храбрость " + bravery + ";"
        );
    }

    private static int calculateCharacteristics(Gryffindor pupil) {
        return pupil.getBravery() + pupil.getHonor() + pupil.getGenerosity();
    }

    static void findBestPupil(Gryffindor firstPupil, Gryffindor secondPupil) {
        if (calculateCharacteristics(firstPupil) > calculateCharacteristics(secondPupil)) {
            System.out.println(firstPupil.getFullName() + " лучший Грифиндорец, чем " + secondPupil.getFullName());
        } else if (calculateCharacteristics(firstPupil) == calculateCharacteristics(secondPupil)) {
            System.out.println("Способности " + firstPupil.getFullName() + " равны способностям " + secondPupil.getFullName());
        } else {
            System.out.println(secondPupil.getFullName() + " лучший Грифиндорец, чем " + firstPupil.getFullName());
        }
    }

}

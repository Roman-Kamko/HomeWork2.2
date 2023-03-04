package edu.skypro.homework;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name,
                      int magicPower,
                      int teleportationPower,
                      int generosity,
                      int honor,
                      int bravery) {
        super(name, magicPower, teleportationPower);
        setNobility(generosity);
        setHonor(honor);
        setBravery(bravery);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility >= 0 && nobility <= 100) {
            this.nobility = nobility;
        } else {
            this.nobility = 0;
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

    private int getAbilities() {
        return nobility + honor + bravery;
    }

    public void compareStudent(Gryffindor student) {
        if (getAbilities() > student.getAbilities()) {
            System.out.printf(
                    "Ученик %s лучший Грифиндорец, чем %s; %d vs %d%n",
                    getFullName(),
                    student.getFullName(),
                    getAbilities(),
                    student.getAbilities()
            );
        } else if (getAbilities() < student.getAbilities()) {
            System.out.printf(
                    "Ученик %s лучший Грифиндорец, чем %s; %d vs %d%n",
                    student.getFullName(),
                    getFullName(),
                    student.getAbilities(),
                    getAbilities()
            );
        } else {
            System.out.printf(
                    "Способности ученика %s и %s равны; %d vs %d%n",
                    getFullName(),
                    student.getFullName(),
                    getAbilities(),
                    student.getAbilities()
            );
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s Благородство: %d ; Честь: %d ; Храбрость: %d;",
                super.toString(),
                nobility,
                honor,
                bravery
        );
    }
}

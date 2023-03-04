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

    private int getAbilities() {
        return generosity + honor + bravery;
    }

    public void compareStudent(Gryffindor student) {
        if (getAbilities() > student.getAbilities()) {
            System.out.printf(
                    "Ученик %s лучший Грифиндорец, чем %s; %d vs %d",
                    getFullName(),
                    student.getFullName(),
                    getAbilities(),
                    student.getAbilities()
            );
        } else if (getAbilities() < student.getAbilities()) {
            System.out.printf(
                    "Ученик %s лучший Грифиндорец, чем %s; %d vs %d",
                    student.getFullName(),
                    getFullName(),
                    student.getAbilities(),
                    getAbilities()
            );
        } else {
            System.out.printf(
                    "Способности ученика %s и %s равны; %d vs %d",
                    getFullName(),
                    student.getFullName(),
                    getAbilities(),
                    student.getAbilities()
            );
        }
    }

    @Override
    public String toString() {
        return this + "Благородство: " + generosity + "; Честь: " + honor + "; Храбрость: " + bravery + ";";
    }

    public void info() {
        System.out.println(this);
    }
}

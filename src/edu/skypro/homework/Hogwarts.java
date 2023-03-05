package edu.skypro.homework;

public abstract class Hogwarts {
    private final String fullName;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int teleportationPower) {
        this.fullName = name;
        setMagicPower(magicPower);
        setTransgressionDistance(teleportationPower);
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower >= 0 && magicPower <= 100) {
            this.magicPower = magicPower;
        } else {
            this.magicPower = 0;
        }
    }

    public void setTransgressionDistance(int transgressionDistance) {
        if (transgressionDistance >= 0 && transgressionDistance <= 100) {
            this.transgressionDistance = transgressionDistance;
        } else {
            this.transgressionDistance = 0;
        }
    }

    private int getAbilities() {
        return magicPower + transgressionDistance;
    }

    public void compareStudent(Hogwarts student) {
        if (getAbilities() > student.getAbilities()) {
            System.out.printf(
                    "Ученик %s, могущественнее ученика %s; %d vs %d%n",
                    getFullName(),
                    student.getFullName(),
                    getAbilities(),
                    student.getAbilities()
            );
        } else if (getAbilities() < student.getAbilities()) {
            System.out.printf(
                    "Ученик %s, могущественнее ученика %s; %d vs %d%n",
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
    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format(
                "Ученик: %s; Магическая сила: %d; Дальность трансгрессии: %d;",
                fullName,
                magicPower,
                transgressionDistance
        );
    }
}
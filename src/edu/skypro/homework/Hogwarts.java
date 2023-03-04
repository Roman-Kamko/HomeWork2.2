package edu.skypro.homework;

public abstract class Hogwarts {
    private final String fullName;
    private int magicPower;
    private int teleportationPower;

    public Hogwarts(String name, int magicPower, int teleportationPower) {
        this.fullName = name;
        this.magicPower = magicPower;
        this.teleportationPower = teleportationPower;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTeleportationPower() {
        return teleportationPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower >= 0 && magicPower <= 100) {
            this.magicPower = magicPower;
        } else {
            this.magicPower = 0;
        }
    }

    public void setTeleportationPower(int teleportationPower) {
        if (teleportationPower >= 0 && teleportationPower <= 100) {
            this.teleportationPower = teleportationPower;
        } else {
            this.teleportationPower = 0;
        }
    }

    private int getAbilities() {
        return magicPower + teleportationPower;
    }

    public void compareStudent(Hogwarts student) {
        if (getAbilities() > student.getAbilities()) {
            System.out.printf(
                    "Ученик %s, могущественнее ученика %s; %d vs %d",
                    getFullName(),
                    student.getFullName(),
                    getAbilities(),
                    student.getAbilities()
            );
        } else if (getAbilities() < student.getAbilities()) {
            System.out.printf(
                    "Ученик %s, могущественнее ученика %s; %d vs %d",
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
        return "Имя ученика: " + fullName +
                "; Магическая силы: " + magicPower +
                "; Дальность трансгрессии: " + teleportationPower + "; ";
    }
}
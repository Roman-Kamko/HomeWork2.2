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

    static void findBestPupilInMagic(Hogwarts firstPupil, Hogwarts secondPupil) {
        if (firstPupil.getMagicPower() > secondPupil.getMagicPower()) {
            System.out.println(firstPupil.getFullName() + " обладает большей мощностью магии, чем " + secondPupil.getFullName());
        } else if (firstPupil.getMagicPower() == secondPupil.getMagicPower()) {
            System.out.println("Сила магии " + firstPupil.getFullName() + " равна " + secondPupil.getFullName());
        } else {
            System.out.println(secondPupil.getFullName() + " обладает большей мощностью магии, чем " + firstPupil.getFullName());
        }
    }
    static void findBestPupilInTeleportation(Hogwarts firstPupil, Hogwarts secondPupil) {
        if (firstPupil.getTeleportationPower() > secondPupil.getTeleportationPower()) {
            System.out.println(firstPupil.getFullName() + " обладает большей дальностью трансгрессии, чем " + secondPupil.getFullName());
        } else if (firstPupil.getTeleportationPower() == secondPupil.getTeleportationPower()) {
            System.out.println("Дальность трансгрессии у " + firstPupil.getFullName() + " равна " + secondPupil.getFullName());
        } else {
            System.out.println(secondPupil.getFullName() + " обладает большей дальностью трансгрессии, чем " + firstPupil.getFullName());
        }
    }
}

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


    private int getAbilities() {
        return diligence + loyalty + honesty;
    }

    public void compareStudent(Hufflepuff student) {
        if (getAbilities() > student.getAbilities()) {
            System.out.printf(
                    "Ученик %s лучший Пуфендуец, чем %s; %d vs %d",
                    getFullName(),
                    student.getFullName(),
                    getAbilities(),
                    student.getAbilities()
            );
        } else if (getAbilities() < student.getAbilities()) {
            System.out.printf(
                    "Ученик %s лучший Пуфендуец, чем %s; %d vs %d",
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
}

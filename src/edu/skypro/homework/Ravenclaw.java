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
        setSmart(smart);
        setWise(wise);
        setWit(wit);
        setCreation(creation);
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

    private int getAbilities() {
        return smart + wise + wit + creation;
    }

    public void compareStudent(Ravenclaw student) {
        if (getAbilities() > student.getAbilities()) {
            System.out.printf(
                    "Ученик %s лучший Когтевранец, чем %s; %d vs %d%n",
                    getFullName(),
                    student.getFullName(),
                    getAbilities(),
                    student.getAbilities()
            );
        } else if (getAbilities() < student.getAbilities()) {
            System.out.printf(
                    "Ученик %s лучший Когтевранец, чем %s; %d vs %d%n",
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
                "%s Ум: %d; Мудрость: %d; Остроумие: %d; Творчество: %d",
                super.toString(),
                smart,
                wise,
                wit,
                creation
        );
    }
}
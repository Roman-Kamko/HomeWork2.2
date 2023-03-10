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
        setCunning(cunning);
        setDetermination(determination);
        setAmbition(ambition);
        setResourcefulness(resourcefulness);
        setLustForPower(lustForPower);
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


    private int getAbilities() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareStudent(Slytherin student) {
        if (getAbilities() > student.getAbilities()) {
            System.out.printf(
                    "???????????? %s ???????????? ????????????????????, ?????? %s; %d vs %d",
                    getFullName(),
                    student.getFullName(),
                    getAbilities(),
                    student.getAbilities()
            );
        } else if (getAbilities() < student.getAbilities()) {
            System.out.printf(
                    "???????????? %s ???????????? ????????????????????, ?????? %s; %d vs %d",
                    student.getFullName(),
                    getFullName(),
                    student.getAbilities(),
                    getAbilities()
            );
        } else {
            System.out.printf(
                    "?????????????????????? ?????????????? %s ?? %s ??????????; %d vs %d",
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
                "%s ????????????????: %d; ??????????????????????????: %d; ??????????????????????????: %d; " +
                        "????????????????????????: %d; ?????????? ????????????: %d;",
                super.toString(),
                cunning,
                determination,
                ambition,
                resourcefulness,
                lustForPower
        );
    }
}


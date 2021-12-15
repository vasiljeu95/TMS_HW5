package com.github.vasiljeu95.tmshw5.task2;

public class Task2 {
}

class Human {
    String nameHuman;
    int ageHuman;
    int massHuman;
    int higthHuman;
    int iqHuman;

    void runningHuman() {
        System.out.println("RUN!");
    }

    void swimmingHuman() {
        System.out.println("SWIM!");
    }

    void bicycleHuman() {
        System.out.println("Keep pedaling!");
    }
}

class Driver extends Human {
    String drivingExperience;
    String driversCattegory;
    boolean medicalCertificate;

    void hasMedicalCertificate () {
        if (medicalCertificate == true) {
            System.out.println("The driver " + nameHuman + " has a medical Certificate");
        } else {
            System.out.println("The driver " + nameHuman + " has NOT a medical Certificate");
        }
    }
}


class DriversLicense extends Human {
    boolean driversLicense;

    void hasDriversLicense () {
        if (driversLicense == true) {
            System.out.println("The driver " + nameHuman + " has a license");
        } else {
            System.out.println("The driver " + nameHuman + " has NOT a license");
        }
    }
}
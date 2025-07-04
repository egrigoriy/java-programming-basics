package org.javaguru.student_grigoriy_emiliyanov.lesson_3.homework.level_4;

public class DoctorCalendarApp {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Nikolay", "Sklifasovski", "infection");
        Patient ivan = new Patient("Ivan", "Ivanovich");
        Patient vasia = new Patient("Vasya", "Pupkin");

        Visit ivanVisit = new Visit(ivan, 800);
        Visit vasiaVisit = new Visit(vasia, 1000);
        doctor.setAmVisit(ivanVisit);
        doctor.setPmVisit(vasiaVisit);
        ivanVisit.setDiagnosis("vse ok");
        vasiaVisit.setDiagnosis("nok");

        System.out.println(doctor.getFirstName() + " " + doctor.getLastName());
        System.out.println("Speciality: " + doctor.getSpeciality());
        System.out.println("AM Visit:");
        System.out.println(doctor.getAmVisit());
        System.out.println("PM Visit:");
        System.out.println(doctor.getPmVisit());

    }
}

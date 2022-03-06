package model;

import java.util.*;

public class Patient extends User{
    private String birthday,blood;
    private double weight,height;
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

public Patient(String name,String email){
    super(name,email);
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + " Kg. ";
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAge: " + birthday +
                ", weight=" + getWeight() +
                ", height=" + getHeight();
    }

    @Override
    public void showdataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }
}

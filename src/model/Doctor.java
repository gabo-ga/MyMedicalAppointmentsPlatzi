package model;

import org.w3c.dom.html.HTMLImageElement;

import java.util.*;

public class Doctor extends User {
    private String speciality;

    //comportamientos
    public Doctor(String name,String email){
        super(name,email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+speciality + "\nAvailable: "+ availableAppointments.toString();
    }

    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;
        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }
        @Override
        public String toString() {
            return "Available Appointments \nDate: " +date+ "\nTime: "+ time;
        }
    }


}

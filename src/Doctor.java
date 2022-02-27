import java.util.*;

public class Doctor extends User{
    private String speciality;

    //comportamientos
    Doctor(String name,String email){
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
    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;
        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }
    }
}

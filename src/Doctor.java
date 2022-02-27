import java.util.*;

public class Doctor {
    //atributos
    static int id=0;//autoincrement
    private String name;
    private String email;
    private String speciality;

    //comportamientos
    Doctor(String name,String speciality){
        this.name = name;
        this.speciality = speciality;
    }
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor:" +id);
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

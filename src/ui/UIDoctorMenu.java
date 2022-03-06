package ui;
import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;
public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointment = new ArrayList<>();
    public static void showdoctorMenua(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " +UIMenu.doctorlogged.getName());
            System.out.println("1. add Available appointment");
            System.out.println("2. My Schedule appointmnets");
            System.out.println("0. log out");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while(response != 0);
    }
    private static void showAvailableAppointments(){
        int response = 0;
        do{
            System.out.println();
            System.out.println("::add Available Appointment");
            System.out.println(":: Select a Month");

            for(int i=0;i<3;i++){
                int j = i+1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            if(response > 0 && response < 4){
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available: [dd/mm/yy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;

                int responseTime = 0;
                String time = "";

                do{
                    System.out.println("Insert the time available for date: " + date + "[16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change time");
                    responseTime = Integer.valueOf(sc.nextLine());

                }while(responseTime == 2);
                UIMenu.doctorlogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointment(UIMenu.doctorlogged);

            }else if(response == 0){
                showdoctorMenua();
            }
        }while(response != 0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor){
        if(doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointment.contains(doctor)){
            doctorsAvailableAppointment.add(doctor);
        }
    }
}

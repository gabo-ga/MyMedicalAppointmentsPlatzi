package ui;
import java.util.*;

import model.Doctor;

import java.util.Scanner;

public class UIPatientManu {
    public static void showPatientMenu(){
        int response =0;
        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientlogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0. logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:

                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while(response!=0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do{
            System.out.println("::Book an appointment");
            System.out.println("::Select date");
            //numeracion de la lista de fechas
            //indice fecha seleccionada
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k=0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointment.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointment.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointmnets = new TreeMap<>();

                for(int j=0; j < availableAppointments.size(); j++){
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointmnets.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointment.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointmnets);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSlected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");
            for (Map.Entry<Integer, Doctor> doc :doctorAvailableSlected.entrySet()){
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }
            System.out.println(doctorSelected.getName() +
                    ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() + ". Time: " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("Confirm your appointment: \n1. Yes \n2. Change data");
            response = Integer.valueOf(sc.nextLine());

    if(response == 1){
            UIMenu.patientlogged.addAppointmentDoctors(doctorSelected,
                                                        doctorSelected.getAvailableAppointments().get(indexDate).getdate(null),
                                                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            showPatientMenu();

    }

        }while(response != 0);
    }

    private static void showPatientMyAppointments(){
        int response = 0;
        do{
            System.out.println("::MY Appointments");
            if(UIMenu.patientlogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don't have appointments");
                break;
            }
            for (int i = 0; i < UIMenu.patientlogged.getAppointmentDoctors().size(); i++) {
                int j = i +1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientlogged.getAppointmentDoctors().get(i).getDate() +
                        "Time: " + UIMenu.patientlogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor:" + UIMenu.patientlogged.getAppointmentDoctors().get(i).getDoctor().getName()
                    );
            }
            System.out.println("0. Return");
        }while(response != 0);
    }
}

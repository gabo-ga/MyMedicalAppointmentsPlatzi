package ui;
import model.Doctor;
import model.Patient;

import java.lang.reflect.Array;
import java.util.*;
public class UIMenu {

    public static String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                                        "Julio","Agosto","Septiembre","Octubre","Noviembre", "Diciembre"};
    public static Doctor doctorlogged;
    public static Patient patientlogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
    public static void authUser(int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejnadro@gmail.com"));
        doctors.add(new Doctor("Mauricio huayta", "mauricio@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Jose Callisaya","josexx@gmail.com"));
        patients.add(new Patient("Manuel Sandoval","manuuu@gmail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: []");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener el usuario logeado
                        doctorlogged = d;
                        //showdoctormenu();
                    }
                }
            }else if(userType == 2){
                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientlogged = p;
                        //showpatientmenu();

                    }
                }
            }
        }while(!emailCorrect);
    }
}

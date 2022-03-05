package ui;
import java.util.Scanner;
public class UIDoctorMenu {
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
            }else if(response == 0){
                showdoctorMenua();
            }
        }while(response != 0);
    }
}

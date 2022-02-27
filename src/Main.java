import static ui.UIMenu.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Gabriel Gonzales","Dermatologia");
        Patient patient1 = new Patient("Alejandra","alejandra@gmail.com");

        myDoctor.addAvailableAppointment(new Date(),"6pm");
        myDoctor.addAvailableAppointment(new Date(),"8pm");

        System.out.println(myDoctor);
    }

}

import static ui.UIMenu.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Gabriel Gonzales","Dermatologia");
        myDoctor.addavailableAppointment(new Date(),"4pm");

        Patient patient1 = new Patient("Alejandra","alejandra@gmail.com");
        //System.out.println(patient1.name);
        //System.out.println(patient1.email);


    }

}

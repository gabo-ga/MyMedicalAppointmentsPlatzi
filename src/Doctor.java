import java.util.*;

public class Doctor {
    //atributos
    static int id=0;//autoincrement
    private String name;
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

}

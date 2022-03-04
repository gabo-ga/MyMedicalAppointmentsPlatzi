package model;

public class Nurse extends User{
    private String speciality;

    public Nurse(String name, String email){
        super(name,email);
    }

    @Override
    public void showdataUser() {
        System.out.println("Hospital: cruz verde");
        System.out.println("Departamentos: nutricion,pediatria");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

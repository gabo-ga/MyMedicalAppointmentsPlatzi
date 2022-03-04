package model;

public class Patient extends User{
    private String birthday,blood;
    private double weight,height;
public Patient(String name,String email){
    super(name,email);
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + " Kg. ";
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAge: " + birthday +
                ", weight=" + getWeight() +
                ", height=" + getHeight();
    }
}

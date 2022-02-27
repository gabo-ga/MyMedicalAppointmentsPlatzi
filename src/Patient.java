public class Patient{
    public int id;
    private String name,email, address,phoneNumber,birthday,blood;
    private double weight,height;
public Patient(String name,String email){
    this.name = name;
    this.email = email;
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
}

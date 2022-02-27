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
        return this.weight + "Kg.";
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getHeight() {
        return height + "m.";
    }
}

import java.io.Serializable;

public class Stdent implements Serializable
{
    private String name;
    transient private String email;
    private int age;
    private String address;

    
    public Stdent(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }
    
    public Stdent() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void display()
    {
        System.out.println("My name is " + this.name);
    }
    
}
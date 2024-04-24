import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Deserial {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        try {
            
            FileInputStream fis = new FileInputStream("ob.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Stdent student = (Stdent) ois.readObject();

            student.display();

            System.out.println(student.getName());
            System.out.println(student.getEmail());
            System.out.println(student.getAge());
            System.out.println(student.getAddress());

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

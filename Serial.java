import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    
   
    public static void main(String[] args) throws IOException {
        
        try {
            
            // create object of student class

            Stdent student = new Stdent("ram", "ram@gmail.com", 25, "Pune");

            // write data to file
            FileOutputStream fos = new FileOutputStream("ob.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);


            // how to serialized

            oos.writeObject(student);

            oos.close();
            fos.close();

            System.out.println("Object state ternsfer to file");

        } 
        catch (Exception e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}

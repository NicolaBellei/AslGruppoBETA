package database;
import java.io.*;
 
public class OutputStream {
 
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        byte b[] = {00,00,00,12};
        File file = new File("Integer.dat");
        FileOutputStream fos = new FileOutputStream(file);
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(1);oos.writeInt(2);
        oos.writeObject("Ciao");
        oos.write(b);
        oos.flush();oos.close();
        /*------------------*/
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readInt());
        System.out.println(ois.readInt());
        String s = (String) ois.readObject();
        System.out.println(s);
        ois.read(b);
        for (byte by:b)
         System.out.print(by+" ");
        System.out.println();
        oos.close();
 
    }
}

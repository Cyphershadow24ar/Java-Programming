import java.io.*;
public class FileIOExample {
    public static void main(String[] args) {
        String byteFile = "data_byte.txt";
        String charFile = "data_char.txt";
        // Byte Stream: FileOutputStream and FileInputStream
        try {
            String bData = "Hello from FileOutputStream.\n";
            FileOutputStream fos = new FileOutputStream(byteFile);
            fos.write(bData.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream(byteFile);
            System.out.println("Reading from data_byte.txt using FileInputStream:");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            fis.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println("Byte Stream Error: " + e.getMessage());
        }
        // Character Stream: FileWriter and FileReader
        try {
            String cData = "Hello from FileWriter.\n";
            FileWriter fw = new FileWriter(charFile);
            fw.write(cData);
            fw.close();

            FileReader fr = new FileReader(charFile);
            System.out.println("Reading from data_char.txt using FileReader:");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Character Stream Error: " + e.getMessage());
        }
    }
}

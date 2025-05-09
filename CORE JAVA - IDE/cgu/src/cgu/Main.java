//package cgu;
//
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.ObjectOutputStream;
//
//public class Main {
//	public static void main(String[] args) {
//		String path = "C:\\Users\\ranik\\Desktop\\Data.ser";
//		// String path = "C:\\Users\\ranik\\Desktop\\Data.txt";
//		// String dest = "C:\\Users\\ranik\\Desktop\\Out.txt";
//		
//		try
//		{
//			// FileReader fr = new FileReader(path);
//			//FileWriter fw = new FileWriter(dest); 
//			// System.out.println("File opened..");
//			
//			FileOutputStream fos = new FileOutputStream(src);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			
//			Employee e = new Employee(101, "Aniket", 1234);
//			oos.writeObject(e);
//			System.out.println("Serialized...");
//			
//			oos.close();
//			fos.close();
//			System.out.println("file closed..");
//			
//			// int ch;
//			// while((ch=fr.read()) != -1){
//				// System.out.print((char)ch);
//				//red(): read character and returns ASCII value.
//				// returns -1 when it reaches and of the file.
//				
//				// fw.write(ch);
//			// }
////			System.out.println("Data copied.");
////			
////			fr.close();
////			fw.close();
////			System.out.println("File closed..");
//		}
//		catch(Exception e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//	}
//}


package cgu;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Create an Employee object
            Employee emp = new Employee(101, "Aniket Raj", 1234);

            // Serialize it to a file
            FileOutputStream fileOut = new FileOutputStream("Employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();

            System.out.println("Serialized Employee object to employee.ser");

            // Deserialize it back
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee deserializedEmp = (Employee) in.readObject();
            in.close();
            fileIn.close();

            // Output deserialized object
            System.out.println("Deserialized Employee: " + deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


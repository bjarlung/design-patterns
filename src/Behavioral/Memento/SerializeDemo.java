package Behavioral.Memento;

import java.io.*;

public class SerializeDemo {

    private static final String DIR = "C:\\Users\\E606817\\Documents\\kotlinProjects\\DesignPatterns\\src\\Behavioral\\Memento\\tmp\\employee.ser";

    private static SeriEmployee deserialize() {
        SeriEmployee seriEmployee = null;
        try {
            FileInputStream fileIn = new FileInputStream(DIR);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            seriEmployee = (SeriEmployee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return seriEmployee;
    }

    private static void serialize(SeriEmployee seriEmployee) {
        try {
            FileOutputStream fileOut = new FileOutputStream(DIR);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(seriEmployee);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SeriEmployee seriEmployee = new SeriEmployee("Bryan", "Gamla gatan 1", "089472028");

        serialize(seriEmployee);

        SeriEmployee newEmp = deserialize();

        System.out.println(newEmp.getName());

    }



}

package Serialization_Deserialization.Externalizable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		File f = new File("ExternalFile");
		Employee emp = new Employee(100, "Harish", 500.00f);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(emp);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		emp = (Employee) in.readObject();

		System.out.println("name: " + emp.name + "\nid: " + emp.id + "\nsalary " + emp.salary);
		
		out.close();
		in.close();
	}
}

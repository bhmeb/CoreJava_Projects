package Serialization_Deserialization.myPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee1 implements Serializable {

	int id;
	String name;
	float salary;

	public Employee1(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee1 obj1 = new Employee1(100, "Harish", 200.00f);
		String filename = "harish.txt";

		//Serialization
		FileOutputStream fileout = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(obj1);
		out.close();
		fileout.close();
		System.out.println("Object has been serialized");

		//De-serialization
		Employee1 obj2 = null;
		FileInputStream filein = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(filein);
		obj2=(Employee1) in.readObject();
		filein.close();
		in.close();
		System.out.println("Object has been deserialized");
		System.out.println("id: "+obj2.id);
		System.out.println("id: "+obj2.name);
		System.out.println("id: "+obj2.salary);
	}

}

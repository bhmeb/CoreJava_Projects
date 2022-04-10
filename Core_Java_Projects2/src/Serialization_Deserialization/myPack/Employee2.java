package Serialization_Deserialization.myPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee2 implements Serializable {

	int id;
	String name;
	float salary;
	transient int pincode;
	static int price;

	

	public Employee2(int id, String name, float salary, int pincode,int price) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.pincode = pincode;
		this.price = price;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee2 obj1 = new Employee2(100, "Harish", 200.00f,721457,1000);
		String filename = "harish.txt";

		//Serialization
		FileOutputStream fileout = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(obj1);
		out.close();
		fileout.close();
		System.out.println("Object has been serialized"+obj1.getClass());

		//De-serialization
		Employee2 obj2 = null;
		obj1.price=2000;
		FileInputStream filein = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(filein);
		obj2=(Employee2) in.readObject();
		filein.close();
		in.close();
		System.out.println("Object has been deserialized");
		System.out.println("id: "+obj2.id);
		System.out.println("name: "+obj2.name);
		System.out.println("salary: "+obj2.salary);
		System.out.println("pincode: "+obj2.pincode);
		System.out.println("price: "+obj2.price);
	}

}

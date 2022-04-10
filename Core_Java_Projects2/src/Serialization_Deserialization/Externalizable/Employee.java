package Serialization_Deserialization.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	int id;
	String name;
	float salary;
	
	public Employee() {}

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		id=in.readInt();
		name=(String) in.readObject();
		salary=in.readFloat();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeInt(id);
		out.writeObject(name);
		out.writeFloat(salary);
	}

}


/* Seriealiastion mainly use to Travel Object's state on Network called marshling.
 *
 * let see simple Example of Serialisation
 */



import java.io.*;
import java.util.*;

class Student implements Serializable
{
	

		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		int id;
		String name;
		
		public Student(int id, String name)
		{
			this.id= id;
			this.name= name;
			
		}
}

class SimpleSerExample 
{

	public static void main(String[] args) throws Exception
	{
		Student s1 = new Student(107, "Mohnish");
		
		FileOutputStream f1 = new FileOutputStream("D:\\Seriealisation.txt");// fileOutputStream Method// here we are creating file
	//	ObjectInputStream o1 = new ObjectInputStream(fis);
		ObjectOutputStream o1 = new ObjectOutputStream(f1); // ObjectOutputSTream Method // here we are calling to Object of our f1 file
		o1.writeObject(s1);// TODO Auto-generated method stub
		o1.flush();
		
		System.out.println("Sucess");

	}

}


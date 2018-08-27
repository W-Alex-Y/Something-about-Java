package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import cus.Customer;

public class ObjectOutputTest {
	public static void main(String[] args) throws Exception{
		Customer cus = new Customer("0001", "王越", "男");
		File file = new File("/Users/wy/Desktop/Untitled.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cus);
		fos.close();
		oos.close();
	}

}

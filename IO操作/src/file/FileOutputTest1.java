package file;

import java.io.FileOutputStream;

public class FileOutputTest1 {
	public static void main(String[] args)throws Exception{
		FileOutputStream fos = new FileOutputStream("/Users/wy/Desktop/Untitled.txt");
		String msg = "wy";
		fos.write(msg.getBytes());
		fos.close();
	}

}

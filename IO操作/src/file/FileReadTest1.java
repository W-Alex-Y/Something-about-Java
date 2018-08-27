package file;

import java.io.File;
import java.io.FileReader;

public class FileReadTest1 {
	public static void main(String[] args) throws Exception{
		File file = new File("/Users/wy/Desktop/Untitled.txt");
		FileReader fr = new FileReader(file);
		char[] data = new char[(int)file.length()];
		fr.read(data);
		fr.close();
		String msg = new String(new String(data));
		System.out.println(msg);
	}

}

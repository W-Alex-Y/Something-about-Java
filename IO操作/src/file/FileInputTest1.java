package file;

import java.io.File;
import java.io.FileInputStream;

class FileInputTest1 {
	public static void main(String[] args) throws Exception{
		File file = new File("/Users/wy/Desktop/Untitled.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[(int)file.length()];
		fis.read(data);
		fis.close();
		String msg = new String(new String(data));
		System.out.println(msg);
	}

}

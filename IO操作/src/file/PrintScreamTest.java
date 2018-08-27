package file;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintScreamTest {
	public static void main(String[] args) throws Exception{
		PrintStream ps = new PrintStream(new FileOutputStream("/Users/wy/Desktop/Untitled.txt"));
		String msg = "wy3";
		ps.println(msg);
		ps.close();
	}

}

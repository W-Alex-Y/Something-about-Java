package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferReaderTest1 {
	public static void main(String[] args)throws Exception{
		File file = new File("/Users/wy/Desktop/Untitled.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while(true){
			String str = br.readLine();
			if(str==null){
				break;
			}
			System.out.println(str);
		}
		fr.close();
		br.close();
	}

}

package file;

import java.io.FileWriter;//将数据写入文件

public class FileWriteTest1 {
	public static void main(String[] args)throws Exception{ 
		FileWriter fw = new FileWriter("/Users/wy/Desktop/Untitled.txt");
		String msg = "王越";
		fw.write(msg);
		fw.close();
	}

}

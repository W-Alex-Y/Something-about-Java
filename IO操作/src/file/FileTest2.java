package file;

import java.io.File;
import javax.swing.JOptionPane;

public class FileTest2 {
	public static void main(String[] args) throws Exception{
		String fileName = JOptionPane.showInputDialog("输入目录路径");
		File file = new File(fileName);
		if(file.exists() && file.isDirectory()){
			File[] files = file.listFiles();
			for(File f : files){
				System.out.println(f.getAbsolutePath());
			}
		}
		else if(!file.isDirectory()){
			System.out.println("不是目录或目录不存在");
		}		
	}
}

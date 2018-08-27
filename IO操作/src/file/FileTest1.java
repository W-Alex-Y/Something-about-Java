package file;

import java.io.File;
import javax.swing.JOptionPane;

public class FileTest1 {
	public static void main(String[] args){
		String fileName = JOptionPane.showInputDialog("输入文件路径");
		File file = new File(fileName);
		if(file.exists()){
			System.out.println("文件大小" + file.length());
			file.delete();
			System.out.println("文件已删除");
		}
		else{
			System.out.println("文件不存在");
		}
	}

}


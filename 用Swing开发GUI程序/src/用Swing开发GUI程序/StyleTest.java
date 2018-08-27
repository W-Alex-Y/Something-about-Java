package 用Swing开发GUI程序;

import javax.swing.*;

public class StyleTest {
	public static void main(String[] args){
		try{
			UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
			for(UIManager.LookAndFeelInfo info:infos){
				UIManager.setLookAndFeel(info.getClassName());
				JOptionPane.showInputDialog(info.getName() + "风格");
			}
		}catch(Exception ex){
		}
	}

}

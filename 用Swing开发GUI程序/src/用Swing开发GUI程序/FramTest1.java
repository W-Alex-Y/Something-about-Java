package 用Swing开发GUI程序;

import javax.swing.JFrame;
import javax.swing.JDialog;
	
public class FramTest1 {
	public static void main(String[] args){
		JFrame frm = new JFrame("这是一个窗口");
		frm.setVisible(true);
		frm.setSize(200, 100);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDialog jd = new JDialog(frm, "这是一个对话框", true);
		jd.setSize(100, 50);
		jd.setVisible(true);
	}

}

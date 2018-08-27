package 用Swing开发GUI程序;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTest extends JFrame{
	private JButton jb = new JButton("按钮");
	private JPanel jp = new JPanel();
	public ColorTest(){
		jp.setBackground(Color.yellow);
		jb.setForeground(Color.red);
		jp.add(jb);
		this.add(jp);
		this.setSize(100, 80);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new ColorTest();
	}
}
 
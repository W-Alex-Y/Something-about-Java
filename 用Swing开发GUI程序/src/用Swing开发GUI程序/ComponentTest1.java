package 用Swing开发GUI程序;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComponentTest1 extends JFrame{
	private JButton jb = new JButton("按钮");
	private JPanel jpl = new JPanel();
	public ComponentTest1(){
		jpl.add(jb);
		this.add(jpl);
		this.setSize(300, 500);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new ComponentTest1();
	}

}

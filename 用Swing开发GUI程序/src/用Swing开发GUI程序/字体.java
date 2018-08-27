package 用Swing开发GUI程序;

import java.awt.Font;
import javax.swing.*;

public class 字体 extends JFrame{
	private JLabel jl = new JLabel("输入账号：");
	private JTextField jtf = new JTextField(10);
	private JPanel jp = new JPanel();
	public 字体(){
		Font fontjl = new Font("楷体_GB2312", Font.BOLD|Font.ITALIC, 20);
		jl.setFont(fontjl);
		Font fontjtf = new Font("黑体", Font.ITALIC, 20);
		jtf.setFont(fontjtf);
		jp.add(jl);
		jp.add(jtf);
		this.add(jp);
		this.setSize(250, 80);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new 字体();
	}

}

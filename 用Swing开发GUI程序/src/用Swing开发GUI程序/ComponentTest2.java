package 用Swing开发GUI程序;

import javax.swing.*;

public class ComponentTest2 extends JFrame{
	private JLabel jl  = new JLabel("注册窗口");
	private JButton jb = new JButton("注册");
	private JTextField jtf = new JTextField(10);
	private JPasswordField jpf = new JPasswordField(10);
	private JTextArea jta = new JTextArea(3, 10);
	private JScrollPane spTaInfo = new JScrollPane(jta);
	private JPanel jp = new JPanel();
	public ComponentTest2(){
		jp.add(jl);
		jp.add(jb);
		jp.add(jtf);
		jp.add(jpf);
		jp.add(spTaInfo);
		jta.setLineWrap(true);//设置自动换行
		jta.setWrapStyleWord(true);//在单词过长时将长单词自动移到下一行
		this.add(jp);
		this.setSize(150, 220);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new ComponentTest2();
	}
}

package 用Swing开发GUI程序;

import javax.swing.*;

public class 菜单 extends JFrame{
	private JMenuBar mb = new JMenuBar();
	private JMenu mFile = new JMenu("文件");
	private JMenuItem Open = new JMenuItem("打开");
	private JMenuItem Save = new JMenuItem("保存");
	private JMenuItem Exit = new JMenuItem("退出");
	public 菜单(){
		mFile.add(Exit);
		mFile.add(Open);
		mFile.add(Save);
		mb.add(mFile);
		this.setJMenuBar(mb);
		this.setSize(200, 180);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new 菜单();
	}
	

}

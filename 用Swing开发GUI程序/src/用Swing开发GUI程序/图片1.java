package 用Swing开发GUI程序;

import javax.swing.*;

public class 图片1 extends JFrame{
	private Icon icon;
	private JButton jbt = new JButton("按钮");
	private JPanel jp = new JPanel();
	public 图片1(){
		icon = new ImageIcon("/Users/wy/Desktop/用Swing开发GUI程序/src/用Swing开发GUI程序/IMG_9577.JPG");
		jbt.setIcon(icon);
		jp.add(jbt);
		this.add(jp);
		this.setSize(250, 80);
		this.setVisible(true);
	}
    public static void main(String[] args){
    	    new 图片1();
    }
	
}

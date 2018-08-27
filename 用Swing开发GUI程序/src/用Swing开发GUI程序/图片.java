package 用Swing开发GUI程序;

import java.awt.*;
import javax.swing.*;

public class 图片 extends JFrame{
	private Image img;
	public 图片(){
		super("这是一个窗口");
		img = Toolkit.getDefaultToolkit().createImage("/Users/wy/Desktop/用Swing开发GUI程序/src/用Swing开发GUI程序/IMG_9577.JPG");
		this.setIconImage(img);
		this.setSize(250, 80);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new 图片();
	}

}

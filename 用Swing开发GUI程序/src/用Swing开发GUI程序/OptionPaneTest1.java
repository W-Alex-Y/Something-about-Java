package 用Swing开发GUI程序;

import javax.swing.JOptionPane;

public class OptionPaneTest1 {
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "这是一个消息框");
		JOptionPane.showInputDialog("这是一个输入框");
		int result = JOptionPane.showConfirmDialog(null, "这是一个确认框");
	}

}

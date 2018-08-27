package 事件处理;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class FocusEventTest extends JFrame implements FocusListener{
	private JButton btOK = new JButton("确定");
	private JTextField tfAcc = new JTextField("请输入您的账号", 10);
	public FocusEventTest(){
		this.setLayout(new FlowLayout());
		this.add(btOK);
		this.add(tfAcc);
		tfAcc.addFocusListener(this);
		this.setSize(200, 80);
		this.setVisible(true);
	}
	public void focusGained(FocusEvent arg0){
		tfAcc.setText("");
	}
	public void focusLost(FocusEvent arg0){
		tfAcc.setText("请您输入账号");
	}
	public static void main(String[] args){
		new FocusEventTest();
	}

}

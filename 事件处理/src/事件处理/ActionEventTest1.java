package 事件处理;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ActionEventTest1 extends JFrame implements ActionListener{
	private JComboBox cbColor = new JComboBox();
	public ActionEventTest1(){
		this.add(cbColor, BorderLayout.NORTH);
		cbColor.addItem(" ");
		cbColor.addItem("红");
		cbColor.addItem("蓝");
		cbColor.addItem("绿");
		cbColor.addActionListener(this);
		this.setSize(30, 100);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		Object color = cbColor.getSelectedItem();
		if(color.equals("红")){
			this.getContentPane().setBackground(Color.red);
		}else if(color.equals("蓝")){
			this.getContentPane().setBackground(Color.blue);
		}else{
			this.getContentPane().setBackground(Color.green);
		}
	}
	public static void main(String[] args){
		new ActionEventTest1();
	}

}

package 事件处理;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest2 extends JFrame{
	private JButton btHello = new JButton("按钮");
	public EventTest2(){
		this.add(btHello);
		btHello.addActionListener(new ButtonClickOpe());
		this.setSize(30, 50);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new EventTest2();
	}
}

class ButtonClickOpe implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Hello");
	}
}

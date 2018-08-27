package 事件处理;

import javax.swing.*;

public class EventTest1 extends JFrame{
	private JButton btHello = new JButton("Hello");
	public EventTest1(){
		this.add(btHello);
		this.setSize(30, 50);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new EventTest1();
	}

}

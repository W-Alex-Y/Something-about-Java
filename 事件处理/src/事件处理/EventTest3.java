package 事件处理;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest3 extends JFrame implements ActionListener{
	private JButton btLogin = new JButton("login");
	private JButton btExit = new JButton("exit");
	public EventTest3(){
		this.setLayout(new FlowLayout());
		this.add(btLogin);
		this.add(btExit);
		btLogin.addActionListener(this);
		btExit.addActionListener(this);
		this.setSize(100, 100);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btLogin){
			System.out.println("login");
		}
		else{
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new EventTest3();
	}

}

package 实验;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class RegisterFrame extends JFrame implements ActionListener{
	private JLabel lbAccount = new JLabel("请输入您的账号");
	private JTextField tfAccount = new JTextField(10);
	private JLabel lbPassword1 = new JLabel("请输入您的密码");
	private JTextField tfPassword1 = new JTextField(10);
	private JLabel lbPassword2 = new JLabel("请确认您的密码");
	private JTextField tfPassword2 = new JTextField(10);
	private JLabel lbName = new JLabel("请您输入姓名");
	private JTextField tfName = new JTextField(10);
	private JLabel lbDept = new JLabel("请您选择部门");
	private JComboBox cbDept = new JComboBox();
	private JButton btRegister = new JButton("注册");
	private JButton btExit = new JButton("退出");
	public RegisterFrame(){
		super("注册");
		this.setLayout(new FlowLayout());
		
	}
}

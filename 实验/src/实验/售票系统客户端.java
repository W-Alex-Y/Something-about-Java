package 实验;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.net.Socket;
import javax.swing.*;
import javax.swing.table.TableColumn;
import java.io.*;

public class 售票系统客户端 extends JFrame implements ActionListener {
	private String welcomeMsg = "   选择如下操作   ";
	private JLabel lwWelcome = new JLabel(welcomeMsg);
	private JButton btConnect = new JButton("连接");
	private JButton btSearch = new JButton("查询票务信息");
	private JButton btRegister = new JButton("用户注册");
	private JButton btSubmit = new JButton("提交订单");
	private JButton btCheck = new JButton("查看订单");
	private JButton btCorrect = new JButton("修改订单");
	private JButton btDelete = new JButton("删除订单");
	private JButton btExit = new JButton("退出");
	private JPanel jp = new JPanel();
	private Socket socket;
	static int number = 213798123;//初始化订单编号;
	public 售票系统客户端() {
		super("客户端");
		this.setLayout(new GridLayout(4,1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp.add(lwWelcome);
		jp.add(btConnect);
		jp.add(btSearch);
		jp.add(btRegister);
		jp.add(btSubmit);
		jp.add(btCheck);
		jp.add(btCorrect);
		jp.add(btDelete);
		this.add(jp);
//		this.add(btConnect, BorderLayout.NORTH);
//		this.add(btSearch, BorderLayout.CENTER);
//		this.add(btRegister, BorderLayout.EAST);
//		this.add(btSubmit, BorderLayout.WEST);
//		this.add(btCheck, BorderLayout.SOUTH);
//		this.add(btCorrect, BorderLayout.NORTH);
		btConnect.addActionListener(this);
		btSearch.addActionListener(this);
		btRegister.addActionListener(this);
		btSubmit.addActionListener(this);
		btCheck.addActionListener(this);
		btCorrect.addActionListener(this);
		btDelete.addActionListener(this);
//		this.setLocation(600,300);
//		this.setSize(150, 600);
		this.setVisible(true);
		this.pack();
		this.setResizable(false);//不可自由改变窗体大小
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class register extends JFrame implements ActionListener{
		private JLabel lbAcc = new JLabel("用户名:");
	    private JLabel lbKey = new JLabel("密码:"); 
		private JLabel lbInfo = new JLabel("欢迎加入我们^.^");
		private JButton btReg = new JButton("注册");
		private JTextField tfAcc = new JTextField("请输入您的账号", 10);
		private JPasswordField pfKey = new JPasswordField(10);
		private JPanel jpl = new JPanel();
		public register(){
			pfKey.setEchoChar('*');
			jpl.add(lbInfo);
			jpl.add(lbAcc);
			jpl.add(tfAcc);
			jpl.add(lbKey);
			jpl.add(pfKey);
			jpl.add(btReg);
			this.add(jpl);
			this.setSize(150, 220);
			this.setVisible(true);
			btReg.addActionListener(this);
		}		
		public void actionPerformed(ActionEvent e){
			try {
				FileWriter fw = new FileWriter("/Users/wy/Desktop/java实验/新注册账号.txt");
				String account = tfAcc.getText() + "\n";
				fw.write(account);
				fw.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null,"恭喜您，注册成功！");
		}
	}
	
	class search extends JFrame{
		public search(){
			try {
				File file = new File("/Users/wy/Desktop/java实验/票务信息.txt");
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				while(true){
					String str = br.readLine();
					if(str==null){
						break;
					}
					JOptionPane.showMessageDialog(售票系统客户端.this,"票务信息：\n" + str);
				}
				fr.close();
	            br.close(); 
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}		
	}

	class submit extends JFrame{
		public submit(){
			String s2 = JOptionPane.showInputDialog("请输入您的订单信息");
			int result = JOptionPane.showConfirmDialog(this,"确定提交订单？");
	        if(result == JOptionPane.YES_OPTION){
	        	try {
					FileWriter fw1 = new FileWriter("/Users/wy/Desktop/java实验/订单编号.txt");
					FileWriter fw2 = new FileWriter("/Users/wy/Desktop/java实验/订单详情.txt");
                    String s1 = Integer.toString(number);
                    number++;
					fw1.write(s1);
					fw1.close();
					fw2.write(s2);
					fw2.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
	        	JOptionPane.showMessageDialog(售票系统客户端.this, "提交成功！");
	        }
		}
	}
	
	class correct extends JFrame{
		public correct(){
			String s = JOptionPane.showInputDialog("请输入您改签后的订单信息");
			int result = JOptionPane.showConfirmDialog(this, "确定改签？");
            if(result==JOptionPane.YES_OPTION)//点“是”的时候返回值为0
            JOptionPane.showMessageDialog(this, "改签成功！\n");
            try{
            	FileOutputStream fos = new FileOutputStream("/Users/wy/Desktop/java实验/订单详情.txt");
            	fos.write(s.getBytes());
            	fos.close();
            }catch(Exception ex){};
		}
	}
	
	class delete extends JFrame{
		public delete(){
			int result = JOptionPane.showConfirmDialog(this, "确定删除订单？");
            if(result==JOptionPane.YES_OPTION)//点“是”的时候返回值为0
            JOptionPane.showMessageDialog(this, "删除成功！");
            try{
           	 FileOutputStream fos1 = new FileOutputStream("/Users/wy/Desktop/java实验/订单编号.txt");
        		 FileOutputStream fos2 = new FileOutputStream("/Users/wy/Desktop/java实验/订单详情.txt");
            }catch(Exception ex){};
		}
	}
	
    class check extends JFrame{
		public check(){
			try{
          		 File file1 = new File("/Users/wy/Desktop/java实验/订单编号.txt");
          		 File file2 = new File("/Users/wy/Desktop/java实验/订单详情.txt");
              	 FileInputStream fis1 = new FileInputStream(file1);
              	 byte[] data1 = new byte[(int)file1.length()];
              	 fis1.read(data1);
              	 fis1.close();
              	 String msg1 = new String(new String(data1));
              	 JOptionPane.showMessageDialog(售票系统客户端.this, "订单编号：" + msg1);
              	 FileInputStream fis2 = new FileInputStream(file2);
             	 byte[] data2 = new byte[(int)file2.length()];
             	 fis2.read(data2);
             	 fis2.close();
             	 String msg2 = new String(new String(data2));
             	 JOptionPane.showMessageDialog(售票系统客户端.this, "订单详情：" + msg2);
          	}catch(Exception ex){};
		}
	}
	
    public void actionPerformed(ActionEvent e){
		if(e.getSource() == btConnect){
			try{
				socket = new Socket("127.0.0.1", 9999);
				this.setTitle("恭喜您，已经连上");
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		else if(e.getSource() == btRegister){
			new register();
		}
		else if(e.getSource() == btSearch){
			new search();
		}
		else if(e.getSource() == btSubmit){
			new submit();
		}
		else if(e.getSource() == btCheck){
			new check();
		}
		else if(e.getSource() == btCorrect){
			new correct();
		}
		else if(e.getSource() == btDelete){
			new delete();
		}
	}
	
	public static void main(String[] args){
		new 售票系统客户端();
	}
	
}
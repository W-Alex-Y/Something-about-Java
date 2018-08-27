package 实验;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import javax.swing.*;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 售票系统 extends JFrame implements ActionListener{
	int flag = 0;
	private ServerSocket ss;
	private Socket socket;
	private JButton btAdd = new JButton("添加票务信息");
	private JButton btDelete = new JButton("删除票务信息");
	private JButton btSearchAcc = new JButton("查看已注册用户");
	private JButton btSearchTic = new JButton("查看已提交订单");
	private JComboBox cbx = new JComboBox();
	private JPanel jpl = new JPanel();
	public static String[] columnNames =  
        {"日期", "车次", "始发站", "出发时间", "终点站", "抵达时间", "票价"};  
	public static Object[][] obj = new Object[20000][7];
	public static JTable table = new JTable(obj, columnNames);  
    //设置JTable的列默认的宽度和高度
	
	public 售票系统() {
		super("服务器端，目前未见连接");
		jpl.add(cbx);
     	jpl.add(btSearchAcc);
     	jpl.add(btSearchTic);
		jpl.add(btAdd);
		jpl.add(btDelete);
		jpl.add(btSearchAcc);
		jpl.add(btSearchTic);
		cbx.addItem("订单管理");
     	cbx.addItem("订单编号");
     	cbx.addItem("订单详情");
		this.add(jpl);
		btDelete.addActionListener(this);
		btAdd.addActionListener(this);
		btSearchAcc.addActionListener(this);
		btSearchTic.addActionListener(this);
		cbx.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setResizable(false);//不可自由改变窗体大小
		this.setVisible(true);
		try{
			ss = new ServerSocket(9999);
			socket = ss.accept();
			String clientAddress = socket.getInetAddress().getHostAddress();
			this.setTitle("客户" + clientAddress + "连接");
		}catch(Exception ex){}
	}
	
		class manage extends JFrame{
			public manage(){
				try{
                	int index = cbx.getSelectedIndex();//返回列表中与给定项匹配的选项
                	if(index==0){}
                	else if(index==1){
                		 File file = new File("/Users/wy/Desktop/java实验/订单编号.txt");
                	     FileInputStream fis = new FileInputStream(file);
                	     byte[] data = new byte[(int)file.length()];
                	     fis.read(data);
                	     fis.close();
                	     String msg = new String(new String(data));
                	     JOptionPane.showMessageDialog(售票系统.this,msg);
                	}
                	else {
                		 File file = new File("/Users/wy/Desktop/java实验/订单详情.txt");
                	     FileInputStream fis = new FileInputStream(file);
                	     byte[] data = new byte[(int)file.length()];
                	     fis.read(data);
                	     fis.close();
                	     String msg = new String(new String(data));
                	     JOptionPane.showMessageDialog(售票系统.this,msg);
                	}
                }catch(Exception ex){};
			}
		}
		
		class add extends JFrame{
			public add(){
				String message = "";
				for(int j = 0; j < 7; j++){  
		            switch (j){  
		            case 0: 
		                obj[flag][j] = JOptionPane.showInputDialog("日期"); 
		                message = message + "日期:" + obj[flag][j] + "\n";
		                break;  
		            case 1:  
		            	    obj[flag][j] = JOptionPane.showInputDialog("车次");
		            	    message = message + "车次:" + obj[flag][j] + "\n";
		                break;  
		            case 2:  
		            	    obj[flag][j] = JOptionPane.showInputDialog("始发站"); 
		            	    message = message + "始发站:" + obj[flag][j] + "\n";
		                break;  
		            case 3:  
		            	    obj[flag][j] = JOptionPane.showInputDialog("出发时间");  
		            	    message = message + "出发时间:" + obj[flag][j] + "\n";
		                break;  
		            case 4: 
		            	    obj[flag][j] = JOptionPane.showInputDialog("终点站"); 
		            	    message = message + "终点站:" + obj[flag][j] + "\n";
		                break;  
		            case 5:  
		            	    obj[flag][j] = JOptionPane.showInputDialog("抵达时间");
		            	    message = message + "抵达时间:" + obj[flag][j] + "\n";
		                break;  
		            case 6:  
		            	    obj[flag][j] = JOptionPane.showInputDialog("票价");
		            	    message = message + "票价:" + obj[flag][j] + "\n";
		                break;  
		            }  
				}
				try {
					FileWriter fw = new FileWriter("/Users/wy/Desktop/java实验/票务信息.txt");
					fw.write(message);
					fw.close();
				} catch (Exception e1) {}
				flag++;
				TableColumn column = null;//TableColumn 表示 JTable 中列的所有属性，如宽度、大小可调整性、最小和最大宽度
		        int colunms = table.getColumnCount();  
		        for(int i = 0; i < colunms; i++)  
		        {  
		            column = table.getColumnModel().getColumn(i);  
		            column.setPreferredWidth(100);//将每一列的默认宽度设置为100  
		        }  
		        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//设置JTable自动调整列表的状态为关闭  
		        JScrollPane scroll = new JScrollPane(table);////用JScrollPane装载JTable，得到滚动条
		        scroll.setSize(300, 200);  
		        add(scroll); 
		        this.setVisible(true);  
		        this.pack();//调整此窗口的大小，以适合其子组件的首选大小和布局。
			}
		}
		
		class searchAcc extends JFrame{
			public searchAcc(){
				try {
					File file = new File("/Users/wy/Desktop/java实验/新注册账号.txt");
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					while(true){
						String str = br.readLine();
						if(str==null){
							break;
						}
						JOptionPane.showMessageDialog(售票系统.this,"已注册账号：\n" + str);
					}
					fr.close();
		            br.close(); 
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		
		class searchTic extends JFrame{
			public searchTic(){
				try{
	          		 File file1 = new File("/Users/wy/Desktop/java实验/订单编号.txt");
	          		 File file2 = new File("/Users/wy/Desktop/java实验/订单详情.txt");
	              	 FileInputStream fis1 = new FileInputStream(file1);
	              	 byte[] data1 = new byte[(int)file1.length()];
	              	 fis1.read(data1);
	              	 fis1.close();
	              	 String msg1 = new String(new String(data1));
	              	 JOptionPane.showMessageDialog(售票系统.this, "订单编号：" + msg1);
	              	 FileInputStream fis2 = new FileInputStream(file2);
	             	 byte[] data2 = new byte[(int)file2.length()];
	             	 fis2.read(data2);
	             	 fis2.close();
	             	 String msg2 = new String(new String(data2));
	             	 JOptionPane.showMessageDialog(售票系统.this, "订单详情：" + msg2);
	          	}catch(Exception ex){};
			}
		}

		class delete extends JFrame{
			public delete(){
				try{    //新建一个相同文件将旧文件清空
            		FileOutputStream fos = new FileOutputStream("/Users/wy/Desktop/java实验/票务信息.txt");
            	}catch(Exception ex){};
			}
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == btAdd){
				new add();
			}
			else if(e.getSource() == btSearchAcc){
				new searchAcc();
			}
			else if(e.getSource() == btSearchTic){
				new searchTic();
			}
			else if(e.getSource() == btDelete){
				new delete();
			}
			else{
				new manage();
			}
		}
    		
		public static void main(String[] args){
		    new 售票系统();
	}

}



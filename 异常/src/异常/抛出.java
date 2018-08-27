package 异常;
import java.util.Date;
import javax.swing.JOptionPane;
public class 抛出 {
	public static void calcArea() throws InputException{
		try{
			String str = JOptionPane.showInputDialog(null, "请您输入半径");
			double r = Double.parseDouble(str);
			double area = Math.PI * r * r;
			System.out.println("该圆面积是:" + area);
		}catch(Exception ex){
			InputException ie = new InputException("发生了异常", new Date());
			throw ie;
		}
	}
	public static void main(String[] args) {
		try{
			calcArea();
		}catch(InputException ie){
			System.out.println(ie.getMessage());
			System.out.println("时间为:" + ie.getDate());
		}
	}

}

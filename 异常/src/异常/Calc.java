package 异常;
import javax.swing.JOptionPane;
public class Calc {
	public static void main(String[] args){
		try{
			String str = JOptionPane.showInputDialog(null, "请您输入半径");
			double r = Double.parseDouble(str);
			double area = Math.PI * r * r;
			System.out.println("该圆面积是：" + area);
		}catch(NumberFormatException ex){
			System.out.println("格式错误");
		}catch(Exception ex){
			System.out.println("转换不成功");
		}finally{
			System.out.println("程序运行完毕");
		}
	}
}

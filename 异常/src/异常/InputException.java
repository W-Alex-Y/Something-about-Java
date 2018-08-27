package 异常;
import java.util.Date;
public class InputException extends Exception{
	private Date date;
	public InputException(String message, Date date){
		super(message);//调用父类中具有相同形参的构造函数
		this.date = date;
	}
	public Date getDate(){
		return this.date;
	}
}

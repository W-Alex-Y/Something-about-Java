package 面向对象编程3;//实例化对象对时候，系统会实现首例化父类对象

class Dialog1{
	protected String title;
	public Dialog1(String title){//若父类构造函数有参数，解决方法有二
		this.title = title;
		System.out.println("父类的构造函数");
	}
	public Dialog1(){//1、写一个不带参数的构造函数  
	}
	public void show(){
		System.out.println(title + "对话框显示");
	}
}

class FontDialog1 extends Dialog1{
	private String fontName;
	public FontDialog1(String title, String fontName){
		super(title);//2、在子类构造函数第一句用super给父类构造函数传参数
		System.out.println("子类的构造函数");
		this.title = title;
		this.fontName = fontName;
	}
}

public class Main {
	public static void main(String[] args){
		FontDialog1 fd = new FontDialog1("字体", "宋体");
	}

}
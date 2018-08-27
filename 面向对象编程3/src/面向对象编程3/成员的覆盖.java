package 面向对象编程3;//最后调用的是子类中的方法。   若要调用父类中的成员函数，可使用super关键字：super.函数名。  重写时子类函数的访问权限不能比父类的更严格

class Dialog2{
	protected String title;
	public void show(){
		System.out.println("Dialog.show()");
	}
}

class FontDialog2 extends Dialog2{
	private String fontName;
	public FontDialog2(String title, String fontName){
		this.title = title;
		this.fontName = fontName;
	}
	public void show(){
		//super.show();
		System.out.println("FontDialog.show()");
	}
}

public class 成员的覆盖 {
	public static void main(String[] args){
		FontDialog2 fd = new FontDialog2("字体", "宋体");
		fd.show();
	}

}

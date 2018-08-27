package 面向对象编程3;

abstract class Dialog5{
	public abstract void show();
}

class FontDialog5 extends Dialog5{
	public void show(){
		System.out.println("FontDialog.show()");
	}
}

public class 抽象类 {
	public static void toCenter(Dialog5 dialog){
		System.out.println("计算屏幕数据");
		dialog.show();
	}
	public static void main(String[] args){
		FontDialog5 fd = new FontDialog5();
		toCenter(fd);
	}

}

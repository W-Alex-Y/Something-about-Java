package 面向对象编程3;

class Dialog3{
	public void show(){
		System.out.println("Dialog.show()");
	}
}

class FontDialog3 extends Dialog3{
	public void show(){
		System.out.println("FontDialog.show()");
	}
}

public class 多态1 {
	public static void toCenter(Dialog3 dialog){//将Dialog作为所有对话框的父类，则这个函数可以应用到所有对话框中
		System.out.println("计算屏幕数据");
		dialog.show();
	}
	public static void fun(Dialog3 dialog){
		dialog.show();
	}
	public static Dialog3 fun1(){
		return new FontDialog3();
	}
	public static void main(String[] args){
//		fun(new FontDialog3());
//		FontDialog3 fd = new FontDialog3();
//		toCenter(fd);
		Dialog3 dialog = fun1();
		dialog.show();
	}

}

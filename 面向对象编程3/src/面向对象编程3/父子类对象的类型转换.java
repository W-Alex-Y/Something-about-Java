package 面向对象编程3;

class Dialog4{
	public void show(){
		System.out.println("Dialog.show()");
	}
}

class FontDialog4 extends Dialog4{
	public void show(){
		System.out.println("FontDialog.show()");
	}
}

public class 父子类对象的类型转换 {
	public static void main(String[] args){
		Dialog4 dialog1 = new Dialog4();
		Dialog4 dialog2 = new FontDialog4();
		FontDialog4 dialog3 = new FontDialog4();
		System.out.println(dialog1 instanceof FontDialog4);
		System.out.println(dialog2 instanceof Dialog4);
		System.out.println(dialog2 instanceof FontDialog4);
		System.out.println(dialog3 instanceof Dialog4);
		System.out.println(dialog3 instanceof FontDialog4);
	}
}

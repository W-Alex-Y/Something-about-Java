package 面向对象编程3;

interface Dialog6{
	public void show();
}

class FontDialog6 implements Dialog6{
	public void show(){
		System.out.println("FontDialog.show()");
	}
}

public class 接口 {
	public static void toCenter(Dialog6 dialog){
		System.out.println("计算屏幕数据");
		dialog.show();
	}
	public static void main(String[] args){
		FontDialog6 fd = new FontDialog6();
		fd.show();
	}

}

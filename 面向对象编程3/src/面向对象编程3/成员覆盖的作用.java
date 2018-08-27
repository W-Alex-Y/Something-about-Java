package 面向对象编程3;

class ImageOpe{
	public void read(){
		System.out.println("从硬件读取图像");
	}
	public void handle(){
		System.out.println("图像去噪声");
	}
	public void show(){
		System.out.println("显示图像");
	}
}

class MyImageOpe extends ImageOpe{
	public void read(){
		System.out.println("从文件读取图像");
	}
	public void handle(){
		super.handle();
		System.out.println("图像去噪声");
	}
	public void show(){
		super.show();
		System.out.println("显示图像");
	}
}

public class 成员覆盖的作用 {
	public static void main(String[] args){
		MyImageOpe mio = new MyImageOpe();
		mio.handle();
		mio.read();
		mio.show();
	}

}

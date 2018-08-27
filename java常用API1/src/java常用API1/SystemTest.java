package java常用API1;

public class SystemTest {
	public static void main(String[] args){
		long t1 = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++){}
		long t2 = System.currentTimeMillis();
		System.out.println("程序运行了：" + (t2-t1) + "毫秒");
	}
}

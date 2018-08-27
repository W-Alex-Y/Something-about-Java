package 面向对象编程2;

class Customer1{
	String name;
	static String bankName;
	static{
		bankName = "香港银行";
		System.out.print("静态代码块执行");
	}
}

public class 静态代码块 {

	public static void main(String[] args) {
		Customer1 zhangsan = new Customer1();
		Customer1 lisi = new Customer1();
	}

}

package 面向对象编程2;

class Customer{
	String name;
	static String bankName;
	static void setbankName(String bankName){
		Customer.bankName = bankName;
	}
}

public class 静态函数 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		zhangsan.name = "张三";
		Customer.setbankName("香港银行");
		Customer lisi = new Customer();
		lisi.name = "李四";
		System.out.println("lisi.bankName = " + Customer.bankName);
	}

}

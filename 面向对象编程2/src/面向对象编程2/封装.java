package 面向对象编程2;

class Customer2{
	String name;
	private int balance = 0;
	public void Cash(int money){
		if(balance < money){
			System.out.println("余额不足");
			return;
		}
		balance -= money;
	}
	public void Store(int money){
		balance += money;
	}
	public int getBalance(){
		return balance;
	}
}

public class 封装 {

	public static void main(String[] args) {
		Customer2 zhangsan = new Customer2();
		System.out.println("zhangsan.balance = " + zhangsan.getBalance());
		zhangsan.Store(100);
		System.out.println("zhangsan.balance = " + zhangsan.getBalance());
		zhangsan.Cash(1000);
		System.out.println("zhangsan.balance = " + zhangsan.getBalance());
	}

}

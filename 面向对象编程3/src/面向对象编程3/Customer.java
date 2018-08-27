package 面向对象编程3;//object类

public class Customer {
	private String name;
	public Customer(String name){
		this.name = name;
	}
	public String toString(){
		return name;
	}
	public boolean equals(Customer cus){
		if(name.equals(cus.name)){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		Customer cus = new Customer("张三");
		System.out.println(cus);
		Customer cus1 = new Customer("张三");
		Customer cus2 = new Customer("张三");
		System.out.println(cus1.equals(cus2));
	}
	
}

package 面向对象编程1;

class Customer {
	String name;
	String sex;
	int age;
	void init(String name, String sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	void display(){
		System.out.println("name = " + name);
		System.out.println("sex = " + sex);
		System.out.println("age = " + age);
	}
}

public class 函数4 {
	
	public static void main(String[] args){
		Customer zhangsan = new Customer();
		zhangsan.init("张三", "男", 25);
		zhangsan.display();
	}

}

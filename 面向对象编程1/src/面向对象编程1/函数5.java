package 面向对象编程1;

class Customer1 {
	String name;
	String sex;
	int age;
	void fun(String name,String sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	Customer1(String name,String sex,int age){
		fun(name, sex, age);
	}
	void display1(){
		System.out.println("name = " + name);
		System.out.println("sex = " + sex);
		System.out.println("age = " + age);
	}
}

public class 函数5 {
	
	public static void main(String[] args){
		Customer1 zhangsan = new Customer1("张三", "男", 25);
		zhangsan.fun("lc", "0", 18);
		zhangsan.display1();
	}
	
}

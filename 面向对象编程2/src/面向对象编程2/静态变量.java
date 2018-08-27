package 面向对象编程2;

class Person{
	String name;
	static int number = 0;
	Person(String name){
		this.name = name;
		System.out.println("创建了" + name);
		number++;
	}
	void die(){
		System.out.println(name + "阵亡");
		number--;
		if(number<3){
			System.out.println("⚠️不足三人");
		}
	}
}

public class 静态变量 {
	public static void main(String[] args) {
		Person p1 = new Person("张三");
		Person p2 = new Person("李四");
		Person p3 = new Person("王五");
		Person p4 = new Person("赵六");
		p3.die();
		p1.die();
	}
}

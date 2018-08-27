package 面向对象编程1;

class Number {
	int a;
}

class Calc2 {
	void fun(Number num) {
		num.a = num.a + 1;
	}
}

public class 函数2 {

	public static void main(String[] args) {
		Number num = new Number();
		num.a = 10;
		Calc2 c = new Calc2();
		c.fun(num);
		System.out.println("num.a = " + num.a);
	}

}

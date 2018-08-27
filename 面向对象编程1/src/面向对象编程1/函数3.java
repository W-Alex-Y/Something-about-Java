package 面向对象编程1;

class Calc3 {
	int abs(int a){
		return a > 0 ? a : -a;
	}
	double abs(double a){
		return a > 0 ? a : -a;
	}
}

public class 函数3 {

	public static void main(String[] args) {
		Calc3 c = new Calc3();
		System.out.println(c.abs(12.5));
		System.out.println(c.abs(-10));
	}

}

package 面向对象编程1;

class Calc1 {
	void fun(int [] arr) {
		arr[0] = arr[0] + 1;
	}
}

public class 函数1 {

	public static void main(String[] args) {
		int[] arr = {10};
		Calc1 c = new Calc1();
		c.fun(arr);
		System.out.println("arr[0] = " + arr[0]);
	}

}

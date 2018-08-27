package chinasei;

public class Customer {
	String name;
	String sex;
	private int age;
	public void setAge(int age){
		if (age<0 || age>100){
			System.out.println("age无法赋值");
			return;
		}
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}

}

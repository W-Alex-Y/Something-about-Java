package file;

import java.io.Serializable;

public class Customer implements Serializable{
	private String account;
	private String password;
	private String cname;
	public Customer(String account, String password, String cname){
		this.account = account;
		this.password = password;
		this.cname = cname;
	}
	public void display(){
		System.out.println("账号：" + account);
		System.out.println("密码" + password);
		System.out.println("姓名：" + cname);
	}
}

package java常用API1;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args){
		Random rnd = new Random();
		System.out.println(rnd.nextInt());//默认范围为0~2^32
		System.out.println(rnd.nextInt(10));
	}

}

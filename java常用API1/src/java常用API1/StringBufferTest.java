package java常用API1;

public class StringBufferTest {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("Hello world1!");
		System.out.println("sb的内容是：" + sb);
		sb.append("China");
		System.out.println("sb的内容是：" + sb);
		sb.append(Math.PI);
		System.out.println("sb的内容是：" + sb);
		sb.delete(2, 5);//该子字符串从指定的 start 处开始，一直到索引 end - 1 处的字符，
		//如果不存在这种字符，则一直到序列尾部。如果 start 等于 end，则不发生任何更改。
		System.out.println("sb的内容是：" + sb);
		sb.deleteCharAt(3);
		System.out.println("sb的内容是：" + sb);
		sb.insert(2, "中国人");
		System.out.println("sb的内容是：" + sb);
		sb.reverse();
		System.out.println("sb的内容是：" + sb);
		System.out.println("sb的长度是：" + sb.length());
		System.out.println("sb对应的字符串是：" + sb.toString());
	}

}

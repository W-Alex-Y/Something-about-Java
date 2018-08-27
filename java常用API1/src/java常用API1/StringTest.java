package java常用API1;

public class StringTest {
	public static void main(String[] args){
		String str = "Chinese";
		System.out.println(str + "中第一个字符是：" + str.charAt(1));
		System.out.println(str + "连接China 的结果是" + str.concat("China"));
		System.out.println(str + "是否以se结尾" + str.endsWith("se"));
		System.out.println(str + "是否以Ch开头" + str.startsWith("Ch"));
		System.out.println(str + "是否和Chinese相等" + str.equals("Chinese"));
		System.out.println(str + "是否和chinese相等(不考虑大小写)" + str.equalsIgnoreCase("chinese"));
		System.out.println(str + "是否以se结尾" + str.endsWith("se"));
		System.out.println(str + "中i字母第一次出现的位置是：" + str.indexOf('i'));
		str.length();
		str.substring(beginIndex, endIndex);//截取某段
		str.replace(oldChar, newChar);
		String chStr = "中国人"；
		String newStr = chStr.trim();
		System.out.println(chStr + "去除两端空格的结果是" + newStr);
		
	}

}

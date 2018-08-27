package java常用API2;

import java.util.HashMap;//若要有序输出，只需将HashMap改为LinkedHashMap
import java.util.Set;//若要按照key值排序，只需将HashMap改为TreeMap;

public class MapTest {
	public static void main(String[] args){
		HashMap hm = new HashMap();//对象无顺序
		hm.put("姓名", "张三");
		hm.put("年龄", 25);
		hm.put("性别", "男");
		System.out.println("姓名为" + hm.get("姓名"));
		hm.put("姓名", "王五");//后者把前者覆盖
		System.out.println("姓名为" + hm.get("姓名"));
		hm.remove("姓名");
		System.out.println("姓名为" + hm.get("姓名"));
		Set keySet = hm.keySet();
		for(Object key:keySet){
			System.out.println(key + "->" + hm.get(key));
		}
	}

}

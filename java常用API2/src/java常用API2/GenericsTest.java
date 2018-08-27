package java常用API2;

import java.util.ArrayList;

public class GenericsTest {
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("中国");
		al.add("美国");
		al.add("日本");
		al.add("韩国");
		al.remove(1);
		al.set(0, "🇨🇳");
		int size = al.size();
		for(int i = 0; i < size; i++){
			String str = al.get(i);
			System.out.println(str);
		}
	}

}

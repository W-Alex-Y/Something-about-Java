package java常用API2;

import java.util.HashSet;//若要有序输出，只需将HashSet改为LinkedHashSet;

public class SetTest {
	public static void main(String[] args){
		HashSet hs = new HashSet();
		hs.add("中国");
		hs.add("美国");
		hs.add("日本");
		hs.add("韩国");
		hs.remove("美国");
		java.util.Iterator ite = hs.iterator();
		while(ite.hasNext()){
			String str = (String)ite.next();
			System.out.println(str);
		}
	}

}

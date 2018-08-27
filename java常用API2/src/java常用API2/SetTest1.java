package java常用API2;

import java.util.Collections;
import java.util.TreeSet;

public class SetTest1 {
	public static void main(String[] args){
		TreeSet ts = new TreeSet(Collections.reverseOrder());
		ts.add("3");
		ts.add("4");
		ts.add("2");
		ts.add("1");
		java.util.Iterator ite = ts.iterator();
		while(ite.hasNext()){
			String str = (String)ite.next();
			System.out.println(str);
		}
	}

}

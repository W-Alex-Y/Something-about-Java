package java常用API2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsTest {
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("3");
		al.add("4");
		al.add("2");
		al.add("1");
		Collections.sort(al);//对List进行升序排列;
		int size = al.size();
		for(int i = 0; i < size; i++){
			String str = (String)al.get(i);
			System.out.println(str);
		}
	}
}

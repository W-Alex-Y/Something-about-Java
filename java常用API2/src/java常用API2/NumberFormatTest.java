package java常用API2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatTest {
	public static void main(String[] args){
		NumberFormat nf = new DecimalFormat("¥,###.##");
		String str = nf.format(830921830912.312312);
		System.out.println(str);
	}

}

package file;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyInputTest {
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("输入消息内容：");
		String msg = br.readLine();
		System.out.println("消息：" + msg);
		isr.close();
		br.close();
	}

}

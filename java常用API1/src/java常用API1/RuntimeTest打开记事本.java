package java常用API1;

public class RuntimeTest打开记事本 {//在windows下
	public static void main(String[] args)throws Exception{
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
	}

}

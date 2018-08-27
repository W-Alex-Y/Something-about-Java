package 单例模式的设计;

public class Main1 {
	public static void click(){
		TaskManagerWindows tmw = SystemConf.tmw;
		tmw.show();
	}
	public static void main(String[] args){
		click();
		click();
	}

}

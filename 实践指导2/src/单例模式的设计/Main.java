package 单例模式的设计;

public class Main {
	public static void click(){
		TaskManagerWindows twm = TaskManagerWindows.getInstance();
		twm.show();
	}
	public static void main(String[] args){
		click();
		click();
	}
}

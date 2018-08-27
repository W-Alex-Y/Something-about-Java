package 单例模式的设计;

public class TaskManagerWindows {
	private static TaskManagerWindows tmw = new TaskManagerWindows();
	public static TaskManagerWindows getInstance(){
		return tmw;
	}
	public TaskManagerWindows(){
		System.out.println("任务管理器创建");
	}
	public void show(){
		System.out.println("任务管理器显示");
	}

}

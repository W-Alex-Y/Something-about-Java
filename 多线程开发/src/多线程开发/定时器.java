package 多线程开发;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{
	public void run(){
		Date d = new Date();
		System.out.println(d);
	}
}

public class 定时器 {
	public static void main(String[] args){
		Timer timer = new Timer();
		timer.schedule(new Task(), new Date(), 1000);
	}

}

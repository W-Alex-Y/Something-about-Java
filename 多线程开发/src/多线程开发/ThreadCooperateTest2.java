package 多线程开发;

import 多线程开发.ThreadCooperateTest2.CalThread;
import 多线程开发.ThreadCooperateTest2.SaveThread;

public class ThreadCooperateTest2 {
	private long sum = 0;
	class CalThread extends Thread{
		public void run(){
			for(int i = 0; i <= 100000; i++){
				sum += i;
			}
		}
	}
	class SaveThread extends Thread{
		public void run(){
			System.out.println("写入数据库：" + sum);
		}
	}
	public static void main(String[] args) throws Exception{
		new Work().work();
	}
}
class Work extends ThreadCooperateTest2{
	public void work() throws Exception{
		CalThread ct = new CalThread();
		SaveThread st = new SaveThread();
		ct.start();
		ct.join();//等待该线程终止。
		st.start();
	}
}

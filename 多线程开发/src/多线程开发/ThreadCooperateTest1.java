package 多线程开发;

public class ThreadCooperateTest1 {
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
			System.out.println("写入数据库：" + sum);//结果错误
		}
	}
	public void work(){
		CalThread ct = new CalThread();
		SaveThread st = new SaveThread();
		ct.start();
		st.start();//st随时可能抢占CPU,而不一定要等到ct运行完毕，故每次结果都不同
	}
	public static void main(String[] args){
		new ThreadCooperateTest1().work();
	}
}

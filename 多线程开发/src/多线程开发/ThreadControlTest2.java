package 多线程开发;

public class ThreadControlTest2 implements Runnable{
	private int percent = 0;
	private boolean RUN = true;
	public void run(){
		while(RUN){
			System.out.println("传输进度" + percent + "%");
			try{
				Thread.sleep(1000);
			}catch(Exception ex){}
			percent += 10;
			if(percent == 100){
				System.out.println("传输完毕");
				break;
			}
		}
	}
	public static void main(String[] args) throws Exception{
		ThreadControlTest2 tct = new ThreadControlTest2();
		Thread th = new Thread(tct);
		th.start();
		Thread.sleep(5000);//在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
		tct.RUN = false;
		System.out.println("暂停十秒钟");
		Thread.sleep(10000);
		tct.RUN = true;
		th = new Thread(tct);
		th.start();
	}
}

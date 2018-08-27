package 多线程开发;

public class ThreadControlTest1 implements Runnable{
	private int percent = 0;
	public void run(){
		while(true){
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
	public static void main(String[] args){
		ThreadControlTest1 tct = new ThreadControlTest1();
		Thread th = new Thread(tct);
		th.start();
	}
}

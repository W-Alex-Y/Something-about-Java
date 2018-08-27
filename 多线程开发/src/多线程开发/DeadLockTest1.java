package 多线程开发;

public class DeadLockTest1 implements Runnable{//死锁案例
	static Object S1 = new Object(), S2 = new Object();
	public void run(){
		if(Thread.currentThread().getName().equals("th1")){
			synchronized(S1){
				System.out.println("线程1锁定S1");
				synchronized(S2){
					System.out.println("线程1锁定S2");
				}
			}
		}
		else{
			synchronized(S2){
				System.out.println("线程2锁定S2");
				synchronized(S1){
					System.out.println("线程2锁定S1");
				}
			}
		}
	}
	public static void main(String[] args){
		Thread t1 = new Thread(new DeadLockTest1(), "th1");
		Thread t2 = new Thread(new DeadLockTest1(), "th2");
		t1.start();
		t2.start();
	}

}

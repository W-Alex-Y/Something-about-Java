package 多线程开发;

class TicketRunnable implements Runnable{
	private int ticketNum = 3;
	public void run(){
		while(true){
			String tName = Thread.currentThread().getName();
			if(ticketNum<=0){
				System.out.println(tName + "无票");
				break;
			}
			else{
				ticketNum--;
				System.out.println(tName + "卖出一张票，还剩" + ticketNum + "张票");
			}
		}
	}
}
public class ThreadSynTest1{
	public static void main(String[] args){
		TicketRunnable tr = new TicketRunnable();
		Thread th1 = new Thread(tr, "线程1");
		Thread th2 = new Thread(tr, "线程2");
		th1.start();
		th2.start();
	}
}

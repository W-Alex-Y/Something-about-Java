package 多线程开发;

class TicketRunnable implements Runnable{
	private int ticketNum = 3;
	public void run(){
		while(true){
			String tName = Thread.currentThread().getName();
			synchronized(this){//将需要独占cpu的代码用synchronized包围起来。
				               //this 指代的是当前同步块所在方法所在的类，当不需要引用别的类的时候。
				if(ticketNum <= 0){
					System.out.println(tName + "无票");
					break;
				}
				else{
					try{
						Thread.sleep(1000);
					}catch(Exception ex){}
					ticketNum--;
					System.out.println(tName + "卖出一张票，还剩" + ticketNum + "张票");
				}
			}
		}
	}
}
public class ThreadSynTest3{
	public static void main(String[] args){
		TicketRunnable tr = new TicketRunnable();
		Thread t1 = new Thread(tr, "线程1");
		Thread t2 = new Thread(tr, "线程2");
		t1.start();
		t2.start();
	}
}


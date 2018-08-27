package 多线程开发;

class FileTransRunnable implements Runnable{
	private String fileName;
	public FileTransRunnable(String fileName){
		this.fileName = fileName;
	}
	public void run(){
		System.out.println("传送" + fileName);
		try{
			Thread.sleep(1000*10);
		}catch(Exception ex){}
		System.out.println(fileName + "传送完毕"); 
	}
}

public class ThreadTest1{
	public static void main(String[] args) throws Exception{
		FileTransRunnable ft1 = new FileTransRunnable("文件1");
		FileTransRunnable ft2 = new FileTransRunnable("文件2");
		FileTransRunnable ft3 = new FileTransRunnable("文件3");
		Thread th1 = new Thread(ft1);
		Thread th2 = new Thread(ft2);
		Thread th3 = new Thread(ft3);
		th1.start();
		th2.start();
		th3.start();
	}
}

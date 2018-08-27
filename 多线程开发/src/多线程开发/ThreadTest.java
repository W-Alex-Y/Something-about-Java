package 多线程开发;

class FileTransThread extends Thread{
	private String fileName;
	public FileTransThread(String fileName){
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

public class ThreadTest {
	public static void main(String[] args){
		FileTransThread ft1 = new FileTransThread("文件1");
		FileTransThread ft2 = new FileTransThread("文件2");
		FileTransThread ft3 = new FileTransThread("文件3");
		ft1.start();
		ft2.start();
		ft3.start();
	}

}

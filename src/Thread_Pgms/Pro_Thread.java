package Thread_Pgms;

public class Pro_Thread extends Thread {
	Pro_Con pc;
	
	public Pro_Thread(Pro_Con pc) {
		this.pc = pc;
	}
	
	public void run()
	{
		try {
			pc.prod();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

package Thread_Pgms;

public class Con_Thread extends Thread {
	Pro_Con pc;
	
	public Con_Thread(Pro_Con pc) {
		this.pc = pc;
	}
	
	public void run()
	{
		pc.cons();
	}
}

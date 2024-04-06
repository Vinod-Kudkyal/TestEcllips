package Thread_Pgms;

public class Pro_Con_Main {
	public static void main(String []a) {
		Pro_Con pc = new Pro_Con();
		
		Pro_Thread pt = new Pro_Thread(pc);
		Con_Thread ct = new Con_Thread(pc);
		
		pt.start();
		ct.start();
	}
}

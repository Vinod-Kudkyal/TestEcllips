package Thread_Pgms;

import java.util.LinkedList;

public class Pro_Con {
	
	LinkedList<Integer> list = new LinkedList<>();
	int cap = 1;
	
	public void cons() {
		while (true) {
			synchronized (this)
			{
				// consumer thread waits while list
				// is empty
				while (list.size() == 0)
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				// to retrieve the first job in the list
				int val = list.removeFirst();

				System.out.println("Consumer consumed-"
								+ val);

				// Wake up producer thread
				notify();

				// and sleep
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	

	public void prod() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this)
			{
				// producer thread waits while list
				// is full
				while (list.size() == cap)
					wait();

				System.out.println("Producer produced-"
								+ value);

				// to insert the jobs in the list
				list.add(value++);

				// notifies the consumer thread that
				// now it can start consuming
				notify();

				// makes the working of program easier
				// to understand
				Thread.sleep(1000);
			}
		}
	}
	
}

package tasks;
class thr extends Thread
{
    int threadname;
	static int i=1;
	public void run() {
		for (int j = 0; j < 25; j++) {
			System.out.println("Thread Name  "+threadname+ " : "+i);
			i++;

		}
	}
}
public class MultipleThread {
	public static void main(String[] args) {
		thr a = new thr();
		thr a1 = new thr();
		a.threadname=1;
		a1.threadname=2;
		a.start();
		a1.start();
		
	}

}

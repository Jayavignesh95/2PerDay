package stringTuts;

public class JavaException {

	public static void main(String[] args) {
		try {
			String strstr = "Test";
			char ar[] = new char[100];
			ar = strstr.toCharArray();
			System.out.println(ar[1003]);
		} catch (Exception e) {
			System.out.println("Exception");
			// e.printStackTrace();;
		}
	}
}

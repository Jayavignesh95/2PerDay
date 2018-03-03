package tasks;

public class BrickProblem {
	public static boolean makeBricks(int small, int big, int goal) {
		if (goal > (big * 5 + small)) {
			return false;
		}
		if ((goal % 5) > small) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		Boolean res = BrickProblem.makeBricks(3, 3, 12);
		System.out.println("Result is " + res);

//		Boolean res = BrickProblem.makeBricks(3, 5, 9);
//		System.out.println("Result is " + res);
//		res = BrickProblem.makeBricks(3, 5, 9);
//		System.out.println("Result is " + res);
//		res = BrickProblem.makeBricks(3, 5, 1);
//		System.out.println("Result is " + res);
//		res = BrickProblem.makeBricks(4, 2, 980);
//		System.out.println("Result is " + res);
//		res = BrickProblem.makeBricks(7,2, 10);
//		System.out.println("Result is " + res);
//		res = BrickProblem.makeBricks(1, 5, 3);
//		System.out.println("Result is " + res);

	}
}

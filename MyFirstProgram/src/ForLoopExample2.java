
public class ForLoopExample2 {
    //     *
	//    ***
	//   *****     
	//  ******* 
	
	public static void main(String[] args) {
		int spaces = 3;
		int stars = 1;
		for (int i = 1; i <= 4; i++) {
			createStep(spaces, stars);
			spaces = spaces - 1;
			stars = stars + 2;
		}
	}

	private static void createStep(int spaces, int stars) {
		printSpaces(spaces);
		printStars(stars);
		System.out.println("");
	}

	static void printSpaces(int count) {
		for (int i = 1; i <= count; i++)
			System.out.print(" ");
	}

	static void printStars(int count) {
		for (int i = 1; i <= count; i++)
			System.out.print("*");
	}
}

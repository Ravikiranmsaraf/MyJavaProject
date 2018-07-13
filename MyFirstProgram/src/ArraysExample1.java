import java.util.ArrayList;
public class ArraysExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(25);
		marks.add(45);
		marks.add(2, 34);
		
		for (int i=0;i<marks.size();i++)
			System.out.println("At index " + i + " have value " + marks.get(i));
		
	}

}

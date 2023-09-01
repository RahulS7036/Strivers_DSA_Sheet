//Coding Ninja

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayDupRemove {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		HashSet<Integer> hash =new HashSet<>(arr);

		return hash.size();
	}
}


public class Day2Part1 {

	public static void main(String[] args) {
		int[][] input = {};
		
		int out = 0;
		for(int i = 0; i < input.length; i++) {
			out += Day2.diff(input[i]);
		}
		System.out.println(out);
	}
	
	public static int findSmall(int[] a) {
		int small = a[0];
		for(int i = 1; i < a.length; i++) {
			if(small > a[i])
				small = a[i];
		}
		return small;
	}
	
	public static int findLarge(int[] a) {
		int large = a[0];
		for(int i = 1; i < a.length; i++) {
			if(large < a[i])
				large = a[i];
		}
		return large;
	}
	
	public static int diff(int[] a) {
		int small = Day2.findSmall(a);
		int large = Day2.findLarge(a);
		int out = large-small;
		return out;
	}
}

package flightmanagement;

import java.util.Arrays;

public class MinMaxFinder {
	public class MinMaxFinder1 {
		public void main(String[] args) {
			findMinMax(new int[] {56,34,7,3,54,3,34,34,53});
		}

		public int[] findMinMax(int[] is) {
			Arrays.sort(is);
			int min = is[0];
			int max = is[is.length-1];
			int res[]= {min,max};
			System.out.println("(Minimum value index 0,Maximum value index 1) : "+res[0]+","+res[1]);
			return res;
		}
	}

	public int[] findMinMax(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}





}

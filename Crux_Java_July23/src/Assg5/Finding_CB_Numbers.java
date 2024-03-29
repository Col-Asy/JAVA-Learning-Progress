package Assg5;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "81615";
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j);// string number
				if (isCBNumber(Long.parseLong(s)) == true && isUsed(visited, i, j - 1) == true) {
					count++;
					for (int k = i; k < j; k++) {
						visited[k] = true;// marked
					}
				}

			}

		}
		System.out.println(count);
	}
	
	public static boolean isUsed(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = i; k <= j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isCBNumber(long n) {
		if(n==0 || n==1) {
			return false;
		}
		long[] arr = {2,3,5,7,11,13,17,19,23,29};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				return true;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(n%arr[i]!=0) {
				return false;
			}
		}
		
		return true;
	}

}

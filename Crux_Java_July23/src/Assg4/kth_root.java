package Assg4;
import java.util.*;
public class kth_root {
	public static void kRoot(long n, int k) {
		long pointer=1, end=n;
		
		while(pointer<=end) {
			long btw=pointer+ (end-pointer)/2;
			
			if(Math.pow(btw, k)<=n) {
				if(Math.pow(btw+1, k)>n) {
					System.out.println(btw);
					break;
				}
				pointer=btw+1;
			}
			
			else {
				end=btw-1;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            long n = input.nextLong();
            int k = input.nextInt();
            kRoot(n, k);
        }
	}

}

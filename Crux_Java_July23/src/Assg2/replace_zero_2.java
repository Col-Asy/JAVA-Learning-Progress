package Assg2;
import java.util.*;
public class replace_zero_2 {
	public static long replace(long n){

        if(n == 0){
            return 5;
        }

        long mult = 1;
        long ans = 0;

        while(n != 0){


            long rem = n % 10;

            if(rem == 0) rem = 5;

            ans = ans + rem * mult;
            mult = mult * 10;
            n = n / 10;
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(replace(n));
	}

}

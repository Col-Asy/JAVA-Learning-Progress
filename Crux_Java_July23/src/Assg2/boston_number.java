package Assg2;
import java.util.*;
public class boston_number {
	public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int primeFactors(int n) {
        int total = 0;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                total += sumDigits(i);
                n /= i;
            }
        }
        if (n > 1)
            total += sumDigits(n);
        return total;
    }

    public static boolean isBoston(int num) {
        if (sumDigits(num) == primeFactors(num))
            return true;
        else
            return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (isBoston(num)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
	}

}

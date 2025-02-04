package Lec26;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		PrimeSieve(n);

	}

// index --> false hoga to prime
// index --> true hoga to not prime	
	private static void PrimeSieve(int n) {
		// TODO Auto-generated method stub
		boolean[] prime = new boolean[n+1];

		prime[0] = true; // Not prime
		prime[1] = true; // Not prime

		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == false) {
				for (int j = 2; i * j < prime.length; j++) {
					prime[i * j] = true;
				}
			}
		}
		
		for(int i=2; i<prime.length; i++) {
			if(prime[i]==false) {
				System.out.print(i+" ");
			}
		}
	}

}

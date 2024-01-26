package Assg4;
import java.util.*;
public class piyush_and_magical_park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int S = scanner.nextInt();
        char[][] park = new char[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                park[i][j] = scanner.next().charAt(0);
            }
        }
        boolean canEscape = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                char cell = park[i][j];
                if (cell == '*') {
                    S += 5;
                } else if (cell == '.') {
                    S -= 2;
                } else {
                    break;
                }
                if (j != M - 1) {
                    S--;
                }
                if (S < K) {
                    canEscape = false;
                    break;
                }
            }
            if (!canEscape) {
                break;
            }
        }
        if (canEscape) {
            System.out.println("Yes");
            System.out.println(S);
        } else {
            System.out.println("No");
        }
	}

}

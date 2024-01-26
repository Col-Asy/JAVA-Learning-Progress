package Assg2;
import java.util.*;
public class conversion_any_to_any {
	public static String convertBase(int sb, int db, String sn) {
        int decimal = Integer.parseInt(sn, sb);
        return Integer.toString(decimal, db);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int sb = scanner.nextInt();
        int db = scanner.nextInt();
        String sn = scanner.next();
        System.out.println(convertBase(sb, db, sn));
	}

}

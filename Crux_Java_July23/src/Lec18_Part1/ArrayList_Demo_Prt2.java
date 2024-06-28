package Lec18_Part1;
import java.util.*;
public class ArrayList_Demo_Prt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(7);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(105);
		list.add(210);
		list.add(310);
		list.add(1);
		list.add(11);
		
		//Capacity se jyada elements daalne par har baar ek naya array banega, jo 1.5times se grow karega

		System.out.println(list);
	}

}

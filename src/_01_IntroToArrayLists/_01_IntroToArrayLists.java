package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> stringAL = new ArrayList<String>();
		//2. Add five Strings to your list
		stringAL.add("hello");
		stringAL.add("my");
		stringAL.add("name");
		stringAL.add("is");
		stringAL.add("jessica\n");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < stringAL.size(); i++){
			System.out.println(stringAL.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s : stringAL){
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		
		for(int i = 0; i < stringAL.size(); i++){
		if((i+1)%2==0) {
			System.out.println(stringAL.get(i));
		}else {
			System.out.println("");
		}
		}
		//6. Print all the Strings in reverse order.
		for(int i = stringAL.size()-1; i >=0; i--){
			System.out.println(stringAL.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}

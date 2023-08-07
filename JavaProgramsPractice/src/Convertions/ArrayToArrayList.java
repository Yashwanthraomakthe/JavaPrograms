package Convertions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		UsingArrayList();

	}

	public static void UsingArrayList() {
		System.out.println("---------------------------");
		String[] temp = { "Abc", "Def", "Ghi", "Jkl" };
		System.out.println("----------Printing Array Elemets-----------------");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(i);
		}
		List<String> list = Arrays.asList(temp);
		System.out.println("----------Printing List Elemets-----------------");
		System.out.println(list);

	}

}

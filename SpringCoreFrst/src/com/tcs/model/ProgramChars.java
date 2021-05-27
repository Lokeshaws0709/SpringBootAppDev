package com.tcs.model;

import java.util.HashMap;
import java.util.Map;

public class ProgramChars {

	public static void main(String[] args) {

		String s = "lolkeshh";
		char[] arr = s.toCharArray();

		int arrLdn = s.length();

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < arrLdn; i++) {

			if (map.containsKey(arr[i])) {

				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);

			}

		}

		System.out.println(map);
		System.out.println("new branch");
		
	}

}

package com.vikas.javastrings;

import java.util.Scanner;

/*
* https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
*/
public class ReverseWordsInString {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		String[] input = new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.next();
		}
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			String[] s = input[i].split("\\.");
			StringBuilder res = new StringBuilder();
			for (int j = s.length - 1; j >= 0; j--) {
				res.append(s[j]);
				if (j != 0) {
					res.append(".");
				}
			}
			result[i] = res.toString();
		}
		for (String s : result) {
			System.out.println(s);
		}
	}
}

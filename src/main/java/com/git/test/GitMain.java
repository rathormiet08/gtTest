package com.git.test;

import java.util.Scanner;

public class GitMain {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String hungry = sc.nextLine();
			if ("Yes" == hungry || "y" == hungry || "Y" == hungry) {
				System.out.println("eat samosa");
				System.out.println("drink pepsi");
			} else {
				System.out.println("do your work");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}

package com.git.test;

import java.util.Scanner;

public class GitMain {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Are you hungry");
			String hungry = sc.nextLine();
			if ("YES" == hungry || "y" == hungry || "Y" == hungry || "yes" == hungry) {
				System.out.println("eat samosa");
				System.out.println("drink pepsi");
				System.out.println("eat burger ");

			} else {
				sc = new Scanner(System.in);
				System.out.println("Are you thirsty");
				String thirsty = sc.nextLine();
				if ("Yes" == thirsty || "yes" == thirsty) {
				System.out.println("dring juice");
				System.out.println("drink pepsi");
				System.out.println("drink coke");
				}
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

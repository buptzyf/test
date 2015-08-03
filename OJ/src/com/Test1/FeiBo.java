package com.Test1;

import java.util.Scanner;

public class FeiBo {
	int Feibo(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			return Feibo(n - 1) + Feibo(n - 2);
		}
	}
	public static void main(String[] args) {
		System.out.println("please input the numeber:");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		FeiBo xx = new FeiBo();
		System.out.println(xx.Feibo(x));
	}
}

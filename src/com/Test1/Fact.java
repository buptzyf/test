package com.Test1;

import java.util.Scanner;

public class Fact {
	static int fact(int n){
		if (n==0){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("please import the n:");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		System.out.println(fact(x));
		}
}
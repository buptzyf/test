package com.Test1;

import java.util.Scanner;

public class XhFb {
	static int fibo(int n){
		int tmp,a=0,b=1;
		for(int i=2;i<=n;i++){
			tmp=b;
			b=a+b;
			a=tmp;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int xx=in.nextInt();
		System.out.println(fibo(xx));
		System.out.println(fibo(xx));
	}
}

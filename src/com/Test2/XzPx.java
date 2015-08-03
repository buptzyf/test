package com.Test2;

import java.util.ArrayList;
import java.util.Scanner;

public class XzPx {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("please input a number n:");
		int n=in.nextInt();
		ArrayList<Integer>list=new ArrayList<>();
		System.out.println("please input the numbers");
		for(int i=0;i<n;i++){
			list.add(in.nextInt());
		}
		Integer[]a=new Integer[list.size()];
		list.toArray(a);
		selectSort(a);
		System.out.println();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			System.out.println(a[i]);
		
		}
		
	}
	//选的是位置
	public static void selectSort(Integer[]a)
	{
	    int minIndex=0;
	    int temp=0;
	    //经常注意边界条件
	    if((a==null)||(a.length==0))
	        return;
	    
	    //排序的开始
	    for(int i=0;i<a.length-1;i++)
	    {
	        minIndex=i;//【无序区】的最小数据数组下标
	        for(int j=i+1;j<a.length;j++)
	        {
	            //在无序区中找到最小数据并保存其数组【下标】
	            if(a[j]<a[minIndex])
	            {
	                minIndex=j;
	            }
	        }
	        if(minIndex!=i)
	        {
	            //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
	            temp=a[i];
	            a[i]=a[minIndex];
	            a[minIndex]=temp;
	        }
	    }
	}
}
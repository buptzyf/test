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
		}
		
	}
	//ѡ����λ��
	public static void selectSort(Integer[]a)
	{
	    int minIndex=0;
	    int temp=0;
	    //����ע��߽�����
	    if((a==null)||(a.length==0))
	        return;
	    
	    //����Ŀ�ʼ
	    for(int i=0;i<a.length-1;i++)
	    {
	        minIndex=i;//��������������С���������±�
	        for(int j=i+1;j<a.length;j++)
	        {
	            //�����������ҵ���С���ݲ����������顾�±꡿
	            if(a[j]<a[minIndex])
	            {
	                minIndex=j;
	            }
	        }
	        if(minIndex!=i)
	        {
	            //�����������������Сֵλ�ò���Ĭ�ϵĵ�һ�����ݣ��򽻻�֮��
	            temp=a[i];
	            a[i]=a[minIndex];
	            a[minIndex]=temp;
	        }
	    }
	}
}
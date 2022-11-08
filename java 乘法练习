import java.text.*;

import java.util.*;

import java.util.Scanner;

import java.io.*;

import java.util.Random;

import java.sql.*;

import java.util.Date;

public class Main

{

	public static void main(String[] args)	{

		System.out.println("请输入你要计算的次数:");

		Scanner io=new Scanner(System.in);

		int keya=io.nextInt();

		jisuan(keya);

	}

 

	private static void jisuan(int keya)

	{

		int success=0;//正确

		int defeated=0;//错误

		for(int i=0;i<keya;i++){

			Date asa=new Date();

			long asd=asa.getTime();

		   if(i==0){

			   System.out.println("*************************");

			   System.out.println("答完题后按回车键继续");

			   System.out.println("你需回答["+keya+"]道题");

			   System.out.println("开始答题");

			   System.out.println("*************************");

		   }

		   Random rada=new Random();

		   int max=rada.nextInt(10);

		   int mac=rada.nextInt(10);

		   int aa=max;

		   int ab=mac;

		   System.out.println("请计算:"+aa+"×"+ab+"=");

		   Scanner fruit=new Scanner(System.in);

		   int fruita=fruit.nextInt();

		   if(aa*ab == fruita){

			   System.out.println("正确");

			   success++;

		   }else{

			   System.out.println("错误 答案:"+aa*ab);

			   defeated++;

		   }

		   

		   //计算结束时

		   if(i+1==keya){

			   Date asb=new Date();

			   long asc=asb.getTime();

			   System.out.println("*************************");

			   System.out.println("          乘法计算");

			   System.out.println("共"+keya+"道题");

			   System.out.println("正确:"+success);

			   System.out.println("错误:"+defeated);

			   System.out.println("花费时间:"+(asc-asd)+"ms");

			   System.out.println("*************************");

		   }

		}

		

	}

}

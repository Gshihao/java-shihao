import java.text.*;

import java.util.*;

import java.util.Scanner;

import java.io.*;

import java.util.Random;

import java.sql.*;

import java.util.Date;

import java.time.*;

/*

定义银行卡和信用卡类

银行卡类

有余额属性和存钱、取钱方法

信用卡类

继承银行卡类

有透支额度属性(初始1000)

重写取款方法

测试类中分别使用两种卡完成存取款操作。*/

class Yinhang{

	//银行卡类	public double yuE=500;//余额

	public void add(double money){

		yuE+=money;

		System.out.println("存款成功，您的余额为 "+yuE);

	}

	public void take(double money){

		if(yuE > money){

			yuE-=money;

			System.out.println("取款成功，您的余额为"+yuE);

		}else{

			System.out.println("erre : not sufficient funds");

		}

	}

}

class Xinyong extends Yinhang{

	//信用卡

	public double touzhi=1000;

	@Override

	public void take(double money)

	{

		if((super.yuE+touzhi)>=money&&super.yuE>=money){

			super.yuE-=money;

			System.out.println("取款成功，信用卡余额:"+super.yuE+"\t 透支额度为:"+touzhi);

		}else if((super.yuE+touzhi)>=money&&super.yuE<money){

			touzhi=super.yuE+touzhi-money;

			super.yuE=0;

			System.out.println("取款成功，信用卡余额:"+super.yuE+"\t 透支额度为:"+touzhi);

		}

	}

}

public class Main

{

	public static void main(String[] args)

	{

		Yinhang yin=new Yinhang();

		Xinyong xin=new Xinyong();

		System.out.println("初始余额为"+yin.yuE);

		System.out.println("用银行卡存300元");

		yin.add(300);

		System.out.println("用银行卡取1000");

		yin.take(1000);

		

		System.out.println("用信用卡存600元");

		xin.add(600);

		System.out.println("用信用卡取1125元");

		xin.take(1125);

	}

}

 

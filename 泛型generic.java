import java.util.*;

import java.lang.Class;

import java.lang.annotation.Annotation;

import java.lang.reflect.*;

import java.io.*;

import java.net.*;

//import java.net.MalformedURLException

public class Main 

{

	public static void main(String age[])	{

	   Tn<String> t=new Tn<>("Root");

	   t.add("刘备");

	   t.add("关于");

	   t.add("孙尚香");

	   t.getchild(0).add("");

	   t.traverse();

	} 

}

class Tn<T>{

	private T value;

	private ArrayList<Tn<T>> chil=new ArrayList<>();

	

	Tn(T t){

		this.value=t;

	}

	public T getvalue(){

		return this.value;

	}

	public void add(T t){

		Tn<T> ch=new Tn<>(t);

		this.chil.add(ch);

	}

	public Tn<T> getchild(int i){

		if (i<0 || i>this.chil.size())

			return null;

		//进行判断，防止出错

		return this.chil.get(i);

	}

	public void traverse(){

		//这一步相当于打印全部

		System.out.println(this.value);

		for(Tn<T> vb:this.chil){

			vb.traverse();

		}

	}

}

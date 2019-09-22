package com.dev.casting;

import java.util.Scanner;

import com.dev.inheritance.Daughter;
import com.dev.inheritance.Father;
import com.dev.inheritance.GrandFather;

public class Test {
	
	public  Test() {
		
	}
	
	public Test(int i,char c) {
		System.out.println(i+c);
	}
	
	@Override
	protected void finalize() {
		System.out.println("dsasda");
	}

	public static void main(String[] args) {
	
		Test t = new Test(1,'b');
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1=t2;
		
		//Runtime.getRuntime().runFinalization();
		
		System.gc();
		
		System.out.println("done");
		
		
		int i=0;
		byte b = (byte)i;
		short s = (short) i;
		int r = b;
		
		int c=98;
		char d = (char) c;
		System.out.println(d);
		
		GrandFather gf = new Father(); //up-casting
		
		Father f = (Father) gf;
		//Father f = (Father) new GrandFather(); exception
		
		GrandFather d1 = new Daughter();
		Daughter d2 = (Daughter) d1;
		
		Scanner sc = new Scanner(System.in);
		int j;
		System.out.println("enter the int");
		j = sc.nextInt();
		System.out.println(j);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the string");
		String sz =sc1.next(); //doesn't take two words
		System.out.println(sz);

	}

}

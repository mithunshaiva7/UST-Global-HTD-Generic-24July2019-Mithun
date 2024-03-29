package com.dev.lambdaexp;

public class Test {

	public static void main(String[] args) {
//		FuncInt f = () -> {
//			for(int i=1;i<=10;i++) {
//				System.out.println("i= "+i);
//			}
//		};
		FuncInt f = () -> {
			try {
				int i=10/0;
				System.out.println(i);
			}catch(Exception e) {
				System.out.println("Exception caught");
			}
		};
		//f.printVal();
		f.printVal();
		
		FuncInt2 f2 = (int i) -> {
			for(int j=1;j<=10;j++) {
				System.out.println("j= "+j);
			}
		};
		
		f2.printValue(5);
		
		
	}

}

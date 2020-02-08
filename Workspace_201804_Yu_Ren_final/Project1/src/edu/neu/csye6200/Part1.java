package edu.neu.csye6200;

public class Part1 {
	public static boolean flag = true;
	public static void demo() {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 26;) {
					while(flag) {
						System.out.print((char)('a' + i));
						i++;
						flag = false;
					}
				}
			}
			
		};
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int j = 0; j < 26;) {
					while(!flag) {
						System.out.print((char)('A' + j));
						j++;
						flag = true;
					}
				}
			}
			
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}

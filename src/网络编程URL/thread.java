package ������URL;

public class thread {
	public static void main(String[] args) {
		test1 a = new test1();
		sever b = new sever();
		a.start();
		b.start();
	}
}

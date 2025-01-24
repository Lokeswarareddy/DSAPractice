package com.java.timecomplexity;

public class TimeCompleXityDemo {

	public long printNaturalNumbers(int n) {

		long sum = n * (n + 1) / 2;
		return sum;

	}

	public long printNaturalNumbers1(int n) {

		int sum = 0;
		for (int i = 0; i <= n; i++) {

			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {

		TimeCompleXityDemo TCM = new TimeCompleXityDemo();

		long startTime = System.currentTimeMillis();
		System.out.println(TCM.printNaturalNumbers(9999));
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken Alogoritm : " + (endTime - startTime));
	}

}

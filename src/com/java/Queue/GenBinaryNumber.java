package com.java.Queue;

import java.util.LinkedList;
import java.util.Queue;

import com.java.array.ArrayUtil;

public class GenBinaryNumber {
	
	public String[] generateBinaryNumber(int n) {
		
		String[] result = new String[n];
		Queue<String> q = new LinkedList<>();
		q.offer("1");
		for(int i = 0 ;i< n ;i++) {
			result[i] = q.poll();
			String n1 = result[i]+"0";
			String n2 = result[i]+"1";
			q.offer(n1);
			q.offer(n2);
			
		}
		return result;
	}

	public static void main(String[] args) {

		GenBinaryNumber GBN = new GenBinaryNumber();
		String[] arr = GBN.generateBinaryNumber(5);
		ArrayUtil.printArray(arr);
		
	}

}

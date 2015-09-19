package com.pierre;

import java.util.Date;

public class SimpleProgram {
	static final int CHUNK_SIZE = 1_000;
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 250000; ++i) {
			long startTime = System.nanoTime();
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < CHUNK_SIZE; ++j) {
				Date a = new Date();
				sb.append(a.toString());
				
			}
			long endTime = System.nanoTime();
			Thread.sleep(1);
			//System.out.printf("%d\t%d\n", i, endTime - startTime);
		}

	}

}

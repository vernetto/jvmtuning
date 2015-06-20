package com.pierre;

public class SimpleProgram {
	static final int CHUNK_SIZE = 1_000;
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 25000; ++i) {
			long startTime = System.nanoTime();
			
			for (int j = 0; j < CHUNK_SIZE; ++j) {
				new Object();
			}
			long endTime = System.nanoTime();
			Thread.sleep(1);
			//System.out.printf("%d\t%d\n", i, endTime - startTime);
		}

	}

}

package com.pierre.heap;

public class RuntimeRunner {
	public static void main(String[] args) {
		System.out.println("availableProcessors=" + Runtime.getRuntime().availableProcessors());
		System.out.println("maxMemory=" + Runtime.getRuntime().maxMemory());
		System.out.println("totalMemory=" + Runtime.getRuntime().totalMemory());
	}

}

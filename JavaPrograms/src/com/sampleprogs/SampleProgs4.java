package com.sampleprogs;

public class SampleProgs4 {
	
	static int i=13;
	static int testMethod() {
		System.out.println("Running the test method");
		return 12;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program Starts");
		int val=SampleProgs4.testMethod();
		int val2= SampleProgs4.i;
		System.out.println("value is "+val);
		System.out.println("value is "+val2);
		System.out.println("Program Ends");
	}

}

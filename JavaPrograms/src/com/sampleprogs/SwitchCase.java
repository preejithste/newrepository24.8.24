package com.sampleprogs;

public class SwitchCase {

	public static void main(String[] args) {

		int weekNo = 4;

		switch (weekNo) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Invalid Week Number");
		}

	}

}

package practice;

import genericUtility.JavaUtility;

public class Calend {
	public static void main(String[] args) {
		JavaUtility jUtil = new JavaUtility();
		String value = jUtil.getCalenderDetails("dd-MM-yyyy");
		System.out.println(value);
		
		int randomNumber = jUtil.getRandomNumber(100);
		System.out.println(randomNumber);
	}

}

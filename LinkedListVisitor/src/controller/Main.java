package controller;

import algorithm.GetLength;
import model.IList;
import model.MTList;

public class Main {

	public static void main(String[] args) {
		String testString = "1 + 2 * 3 / 4";
		String[] testStringArray = testString.split(" ");
		IList stringList = MTList.Singleton;
		for(int i = 0; i < testStringArray.length; i++ ){
			stringList = stringList.push(testStringArray[i]);
		}
		System.out.println(stringList.execute(GetLength.Singleton));
		System.out.println(stringList.toString());
	}

}

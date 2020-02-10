package com.example;

import java.util.ArrayList;

public class Div {

	private final long id;
	private final String result;
	double res;
	
	public Div(long id, ArrayList<String> numbers) {
		this.id = id;
		if (isNumeric(numbers.get(0))) {
			res = Double.parseDouble(numbers.get(0));
			
		}
		for (int y = 1 ; y < numbers.size() ; y++) {
		 if (isNumeric(numbers.get(y))) {
		res	/= Double.parseDouble(numbers.get(y));
		}
		 
		 }
		String sumString = Double.toString(res);
		this.result = sumString;
	}

	public long getId() {
		return id;
	}

	public String getResult() {
		return result;
	}
	
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}

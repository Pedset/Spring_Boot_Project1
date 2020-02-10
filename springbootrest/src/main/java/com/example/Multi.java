package com.example;

import java.util.ArrayList;

public class Multi {

	private final long id;
	private final String result;

	
	public Multi(long id, ArrayList<String> numbers) {
		this.id = id;
		double res = 1;
		for (String x: numbers) {
		 if (isNumeric(x)) {
		res	*= Double.parseDouble(x);
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
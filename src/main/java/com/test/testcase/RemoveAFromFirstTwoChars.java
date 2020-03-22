package com.test.testcase;

public class RemoveAFromFirstTwoChars {
	  public String removeA(String string) {
			int stringLength=string.length();
			char firstChar = string.charAt(0);
			char secondChar =  string.charAt(1);
			String result = string;
			String remainingChar="";
			if(firstChar=='A')
			{
			 remainingChar=string.substring(1,stringLength);
		     result= ""+remainingChar;
			}
			if(secondChar=='A')
			{
			 remainingChar=string.substring(2,stringLength);
			 result=""+firstChar+remainingChar;
			}
			if(firstChar=='A' && secondChar=='A')
			{
		     remainingChar=string.substring(2,stringLength);
		     result=""+remainingChar;
			}
			return result ;
			}
}

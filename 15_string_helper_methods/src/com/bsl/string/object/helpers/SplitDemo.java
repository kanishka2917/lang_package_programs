package com.bsl.string.object.helpers;

public class SplitDemo {

	public static void main(String[] args) {
			
		String s3 = "hello guys, how are you, thankyou very much.";
		String []as3 = s3.split(" ");//space is the de-limmiter 
		for(int i = 0; i<as3.length; i++) {
			System.out.println(as3[i]);
		}
	}

}

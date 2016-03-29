package com.study.generic;

public class GenericDemo07 {

	public static void main(String[] args) {
	     String str[] = {"hello","nice","girl"};
	     tell(str);
	}
	public static <T>void tell(T t[]){
		
		for(int i = 0;i < t.length;i++){
			System.out.println(t[i]);
		}
	}

}

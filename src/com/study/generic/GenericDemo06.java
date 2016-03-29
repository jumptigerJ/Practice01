package com.study.generic;

class Test{
	public <T>T tell(T t){
		return t;
	}
}

public class GenericDemo06 {

	public static void main(String[] args) {
		Test t = new Test();
		String str = t.tell("testtest");
		System.out.println(str);
		Integer i = t.tell(22);
		System.out.println(i);

	}

}

package com.study.generic;


class Conn<T>{
	private T value;
	

	public Conn(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}

public class GenericDemo02 {

	public static void main(String[] args) {
		
		Conn<String> c = new Conn<String>("ππ‘Ï∆˜∑∫–Õ≤‚ ‘");
		System.out.println(c.getValue());
	

	}

}

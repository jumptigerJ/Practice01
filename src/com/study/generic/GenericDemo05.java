package com.study.generic;

interface GenInter<T>{
	public void say();
}
class Gin<T> implements GenInter<T>{
	private T info;
	public Gin(T info){
		this.info = info;
		
	}
	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public void say(){
		
	}
}
public class GenericDemo05 {

	public static void main(String[] args) {
		Info<String> i =  new Info<String>();
		i.setKey("heyhey");
		System.out.println(i.getKey());

	}

}

package com.study.generic;

class Info<T>{
	private T key;
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return this.getKey().toString();
	}
}
public class GeneriDemo04 {

	public static void main(String[] args) {
		Info<String> i = new Info<String>();
		i.setKey("testtest");
		tell(i);

	}
	/**
	 * Í¨Åä·û £¿
	 * @param i
	 */
	public static void tell(Info<?> i){
		System.out.println(i);
	}

}

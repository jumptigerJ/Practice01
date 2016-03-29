package com.study.generic;

class Point<T>{
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}

	
}

public class GenericDemo01 {

	/**
	 * 经纬度
	 * int
	 * float
	 * String
	 * @param args
	 */
	public static void main(String[] args) {
		Point<String> p = new Point<String>();
		p.setX("经度为：109");
		p.setY("维度为：100");
		String px = (String) p.getX();
		String py = (String) p.getY();
		System.out.println(px + "   " + py);

	}

}

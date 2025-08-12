package com.deepak.designPattern;

public final class MyImmutable {

	private final int i;

	public MyImmutable(int i) {
		this.i = i;
	}

	public MyImmutable immutable(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new MyImmutable(i);
		}
	}

	public static void main(String[] args) {
		MyImmutable im = new MyImmutable(5);
		MyImmutable im1 = im.immutable(100);
		MyImmutable im2 = im.immutable(5);
		System.out.println(im == im1);
		System.out.println(im == im2);

	}

}

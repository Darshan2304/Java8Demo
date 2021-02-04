package com.demo.lambda;

/**
 * @author Darshan2304
 * To demonstrate interfaces in java8
 *
 */
interface Phone{
	void call();
	default void message() {
		System.out.println("Sent");
	}
}

class AndroidPhone implements Phone{
	public void call() {
		System.out.println("Calling");
	}
}


public class DemoInterface {

	public static void main(String[] args) {
		Phone thePhone = new AndroidPhone();
		
		thePhone.call();
		thePhone.message();
	}
}

package com.katolisa.rpg.exception;

public class FirstArgumentException extends ArgumentException {
	public FirstArgumentException() {
	}

	public FirstArgumentException(String message) {
		System.out.println(message);
	}
}

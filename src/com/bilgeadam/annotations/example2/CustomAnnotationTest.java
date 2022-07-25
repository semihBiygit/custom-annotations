package com.bilgeadam.annotations.example2;

import java.lang.reflect.Method;

public class CustomAnnotationTest {

	public static void main(String[] args) throws Exception {

		Hello hello = new Hello();
		Method method = hello.getClass().getMethod("sayHello");

		MyAnnotation myAnno = method.getAnnotation(MyAnnotation.class);
		System.out.println("Value is: " + myAnno.value());
	}

}

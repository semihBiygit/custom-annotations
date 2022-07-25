package com.bilgeadam.annotations.example2;

import java.lang.reflect.Method;

public class CustomAnnotationTest {

	public static void main(String[] args) throws Exception {

		Hello hello = new Hello();

		Method method = hello.getClass().getMethod("sayHello");
		MyAnnotation myAnno = method.getAnnotation(MyAnnotation.class);
		System.out.println("sayHello's Value is: " + myAnno.value());

		Method method2 = hello.getClass().getMethod("sayBye");
		MyAnnotation myAnno2 = method2.getAnnotation(MyAnnotation.class);
		System.out.println("sayBye's Value is: " + myAnno2.value());

	}

}

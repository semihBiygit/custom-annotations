package com.bilgeadam.annotations.example2;

public class Hello {

	@MyAnnotation(value = 50)
	public void sayHello(){
		System.out.println("Hello Java annotations");
	 }  
}

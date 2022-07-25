package com.bilgeadam.annotations.example2;

public class Hello {
	
	@MyAnnotation(value = 30)
	public void sayHello(){
		System.out.println("Hello Java annotations");
	 }  
	
	@MyAnnotation(value = 10)
	public void sayBye() {
		System.out.println("Bye Java");
	}
}

package com.bilgeadam.annotations.example1;

public class AnnotationTest {

	public static void main(String[] args) {
		Person person = new Person("Ahmet", "Mehmet", 25);

		if (person.getClass().isAnnotationPresent(VeryImportant.class)) {
			System.out.println("This person is very important");
		} else {
			System.out.println("This person is not very important :( ");
		}

	}

}

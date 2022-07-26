package com.bilgeadam.annotations.example3;

import java.lang.reflect.Field;
import java.util.Date;

public class AnnotationExample {

	public static void main(String[] args) throws Exception {
		
	    System.out.println("Java Custom Annotation Example");
        System.out.println();
  
        User user = new User();
        user.setEmail("john.doe@example.com");
        user.setName("John Doe");
        user.setId(112);
        user.setCreated(new Date());
  
        for (Field field : user.getClass().getDeclaredFields()) {
            DBField dbField = field.getAnnotation(DBField.class);
            System.out.println("field name: " + dbField.name());
  
            // changed the access to public
            field.setAccessible(true);
            Object value = field.get(user);
            System.out.println("field value: " + value);
  
            System.out.println("field type: " + dbField.type());
            System.out.println("is primary: " + dbField.isPrimaryKey());
            System.out.println();
        }
		
	}

}

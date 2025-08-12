package com.deepak.java11coding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

// Define a custom NonNull annotation
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface NonNull {
}

public class LocalVariableLambda {

	public static void varFeature(List<String> languages) {
		// str.forEach();
		languages.forEach((@NonNull var str) -> System.out.println(str));

	}

	public static void main(String[] args) {
		List<String> languages = List.of("Java", "Python", "Go");
		varFeature(languages);

	}

}

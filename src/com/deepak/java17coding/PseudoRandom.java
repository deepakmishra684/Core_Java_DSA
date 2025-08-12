package com.deepak.java17coding;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class PseudoRandom {

	public static void main(String[] args) {
		/* Using a New Generator */
		RandomGenerator generator = RandomGeneratorFactory.of("L64X128MixRandom").create();
		System.out.println(generator.nextInt());

		/* Generate Stream of Doubles */
		RandomGenerator rng = RandomGenerator.of("Xoshiro256PlusPlus");
		rng.doubles(5, 1.0, 10.0).forEach(System.out::println); // 5 random doubles between 1.0 and 10.0

	}
}

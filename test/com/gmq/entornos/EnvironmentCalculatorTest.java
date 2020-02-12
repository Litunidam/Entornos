package com.gmq.entornos;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EnvironmentCalculatorTest {

	EnvironmentCalculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new EnvironmentCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@ParameterizedTest
	@MethodSource("sumC")
	void should_sum_two_variables(BigDecimal firstSummand,BigDecimal secondSummand,BigDecimal solution) {
		//Suma
		BigDecimal result=calculator.sum(firstSummand, secondSummand);
		assertEquals(result,solution);
	
	}
	@ParameterizedTest
	@MethodSource("substrC")
	void should_substract_two_variables(BigDecimal minuend,BigDecimal substrahend,BigDecimal solution) {
			BigDecimal result=calculator.substract(minuend, substrahend);
			assertEquals(result,solution);
	}
	
	@ParameterizedTest
	@MethodSource("multC")
	void should_multiply_two_variables(BigDecimal multiplicand,BigDecimal multiplier,BigDecimal solution) {
			BigDecimal result=calculator.multiply(multiplicand, multiplier);
			assertEquals(result,solution);
	}
	@ParameterizedTest
	@MethodSource("divC")
	void should_divide_two_variables(BigDecimal dividend, BigDecimal divisor,BigDecimal solution) {
			BigDecimal result=calculator.divide(dividend, divisor);
			assertEquals(result,solution);
	}
	@ParameterizedTest
	@MethodSource("mcdC")
	void should_mcd_two_variables(BigDecimal first, BigDecimal second,BigDecimal solution) {
		BigDecimal result=calculator.mcd(first, second);
		assertEquals(result,solution);
	}
	@ParameterizedTest
	@MethodSource("mcmC")
	void should_mcm_two_variables(BigDecimal first, BigDecimal second,BigDecimal solution) {
			BigDecimal result=calculator.mcm(first, second);
			assertEquals(result,solution);
	}
	
	static Stream<Arguments> sumC(){
		return Stream.of(
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(5),BigDecimal.valueOf(15))
		);
	}
	static Stream<Arguments> substrC(){
		return Stream.of(
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(5),BigDecimal.valueOf(5)),
			Arguments.of(BigDecimal.valueOf(0),BigDecimal.valueOf(0),BigDecimal.valueOf(0)),
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(100),BigDecimal.valueOf(-90)),
			Arguments.of(BigDecimal.valueOf(-10),BigDecimal.valueOf(100),BigDecimal.valueOf(-110))
		);
	}
	static Stream<Arguments> multC(){
		return Stream.of(
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(5),BigDecimal.valueOf(50)),
			Arguments.of(BigDecimal.valueOf(0),BigDecimal.valueOf(0),BigDecimal.valueOf(0)),
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(100),BigDecimal.valueOf(1000)),
			Arguments.of(BigDecimal.valueOf(-10),BigDecimal.valueOf(100),BigDecimal.valueOf(-1000))
		);
	}
	static Stream<Arguments> divC(){
		return Stream.of(
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(5),BigDecimal.valueOf(2)),
			Arguments.of(BigDecimal.valueOf(0),BigDecimal.valueOf(0),BigDecimal.valueOf(Math.E)),
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(100),BigDecimal.valueOf(0.1)),
			Arguments.of(BigDecimal.valueOf(-100),BigDecimal.valueOf(10),BigDecimal.valueOf(-10)),
			Arguments.of(BigDecimal.valueOf(1908273),BigDecimal.valueOf(0),BigDecimal.valueOf(Math.E))
				
				
		);
	}
	static Stream<Arguments> mcdC(){
		return Stream.of(
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(5),BigDecimal.valueOf(5)),
			Arguments.of(BigDecimal.valueOf(0),BigDecimal.valueOf(0),BigDecimal.valueOf(0)),
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(100),BigDecimal.valueOf(10)),
			Arguments.of(BigDecimal.valueOf(-100),BigDecimal.valueOf(10),BigDecimal.valueOf(10)),
			Arguments.of(BigDecimal.valueOf(1908273),BigDecimal.valueOf(0),BigDecimal.valueOf(0))
				
				
		);
	}
	static Stream<Arguments> mcmC(){
		return Stream.of(
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(5),BigDecimal.valueOf(10)),
			Arguments.of(BigDecimal.valueOf(0),BigDecimal.valueOf(0),BigDecimal.valueOf(0)),
			Arguments.of(BigDecimal.valueOf(10),BigDecimal.valueOf(100),BigDecimal.valueOf(10)),
			Arguments.of(BigDecimal.valueOf(-100),BigDecimal.valueOf(10),BigDecimal.valueOf(1)),
			Arguments.of(BigDecimal.valueOf(1908273),BigDecimal.valueOf(0),BigDecimal.valueOf(0))
				
				
		);
	}
}

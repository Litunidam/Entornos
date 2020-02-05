package com.gmq.entornos;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvironmentCalculatorTest {

	EnvironmentCalculator calculator = new EnvironmentCalculator();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void should_sum_two_variables() {
		BigDecimal imputx =new BigDecimal(10);
		BigDecimal imputy = new BigDecimal(5);
		BigDecimal result;
		//Suma
		result=new BigDecimal(15);
		BigDecimal sumResult;
		sumResult=calculator.sum(imputx, imputy);
		assertEquals(result,sumResult);
		//Resta
		result=new BigDecimal(5);
		BigDecimal subsResult;
		subsResult=calculator.substract(imputx, imputy);
		assertEquals(result,subsResult);
		//Multiplicación
		result=new BigDecimal(50);
		BigDecimal multResult;
		multResult=calculator.multiply(imputx, imputy);
		assertEquals(result,multResult);
		//Division
		result=new BigDecimal(2);
		BigDecimal divResult;
		divResult=calculator.divide(imputx, imputy);
		assertEquals(result,divResult);
		//Máximo Común Divisor
		result=new BigDecimal(5);
		BigDecimal mcdResult;
		mcdResult=calculator.mcd(imputx, imputy);
		assertEquals(result,mcdResult);
		//Mínimo común Multiplo
		result=new BigDecimal(5);
		BigDecimal mcmResult;
		mcmResult=calculator.mcm(imputx, imputy);
		assertEquals(result,mcmResult);
		
	}

}

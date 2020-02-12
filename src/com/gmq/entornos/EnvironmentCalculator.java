package com.gmq.entornos;

import java.math.BigDecimal;

public class EnvironmentCalculator implements Calculator {

	@Override
	public BigDecimal sum(BigDecimal firstSummand, BigDecimal secondSummand) {

		return firstSummand.add(secondSummand);
	}

	@Override
	public BigDecimal substract(BigDecimal minuend, BigDecimal subtrahend) {
		return minuend.subtract(subtrahend);
	}

	@Override
	public BigDecimal multiply(BigDecimal multiplicand, BigDecimal multiplier) {
		return multiplicand.multiply(multiplier);
	}

	@Override
	public BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
		if (divisor == BigDecimal.ZERO) {
			return BigDecimal.valueOf(Math.E);
		}
		return dividend.divide(divisor);

	}

	@Override
	public BigDecimal mcd(BigDecimal first, BigDecimal second) {
		BigDecimal max = first.max(second);
		BigDecimal min = first.min(second);
		BigDecimal mcd = new BigDecimal(0);
		if (BigDecimal.valueOf(0) == first || BigDecimal.valueOf(0) == second) {
			System.out.println("holi");
			return BigDecimal.ZERO;
		} else {
			do {
				mcd = min;
				min = max.remainder(min);
				max = mcd;
			} while (min.compareTo(BigDecimal.ZERO) != 0);

			return mcd;
		}

	}

	@Override
	public BigDecimal mcm(BigDecimal first, BigDecimal second) {
		if (BigDecimal.valueOf(0) == first || BigDecimal.valueOf(0) == second) {
			System.out.println("holi");
			return BigDecimal.ZERO;
		} else {
			BigDecimal max = first.max(second);
			BigDecimal min = first.max(first);
			BigDecimal mcm = new BigDecimal(0);
			mcm = (max.divide(this.mcd(first, second))).multiply(min);

			return mcm;
		}
	}
}

package br.com.cod3r.strategy.calc.after;

import br.com.cod3r.strategy.calc.after.strategies.AdditionOperation;
import br.com.cod3r.strategy.calc.after.strategies.DivisionOperation;
import br.com.cod3r.strategy.calc.after.strategies.MultiplicationOperation;
import br.com.cod3r.strategy.calc.after.strategies.SubtractionOperation;

import java.lang.Math;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));

		System.out.println(calc.getResult((n1, n2) -> {
			return (int) Math.pow(n1,n2);
		}));
	}
}

package pgo6;

import java.math.BigDecimal;
import java.util.List;

public class Task1 {

}

class Multiplier {
	public int multiply(int n1, int n2){
		return n1 * n2;
	}
	
	public int multiply(int n1, int n2, int n3, int n4) {
		return multiply(n1, n2) * multiply(n3, n4);
	}
	
	public double multiply(double n1, double n2) {
		
		return n1 * n2;
	}
	
	public BigDecimal multiply(BigDecimal n1, BigDecimal n2) {
		return n1.multiply(n2);
	}
	public int multiply(List<Integer> list) {
		int res = 1;
		
		for(int i : list)
			res *= i;
		
		return res;
	}
	
}

class Adder{
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public BigDecimal add(List<BigDecimal> list) {
		BigDecimal sum = new BigDecimal(0);
		
		for(BigDecimal n : list)
			sum.add(n);
		
		return sum;
	}
}
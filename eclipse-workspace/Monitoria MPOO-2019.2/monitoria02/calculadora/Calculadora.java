package calculadora;

public class Calculadora {
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.calcular(12000000000000000l, 1000000000000000l, "+"));
		System.out.println(calculadora.calcular(new byte[] {1,0,1,1}, new byte[] {1,0,1,0}, "+"));
	}
	
	public double calcular(int x, int y, String op) {
		double resultado = 0;
		switch (op) {
		case "+":
			resultado = x + y;
		case "-":
			resultado = x - y;
			break;
		case "*":
			resultado = x * y;
			break;
		case "/":
			if (y == 0)
				resultado = 0;
			else
				resultado = x / y;
			break;
		}
		return resultado;
	}
	public double calcular(double x, double y, String op) {
		double resultado = 0;
		switch (op) {
		case "+":
			resultado = x + y;
		case "-":
			resultado = x - y;
			break;
		case "*":
			resultado = x * y;
			break;
		case "/":
			if (y == 0)
				resultado = 0;
			else
				resultado = x / y;
			break;
		}
		return resultado;
	}
	public double calcular(float x, float y, String op) {
		double resultado = 0;
		switch (op) {
		case "+":
			resultado = x + y;
		case "-":
			resultado = x - y;
			break;
		case "*":
			resultado = x * y;
			break;
		case "/":
			if (y == 0)
				resultado = 0;
			else
				resultado = x / y;
			break;
		}
		return resultado;
	}
	public double calcular(short x, short y, String op) {
		double resultado = 0;
		switch (op) {
		case "+":
			resultado = x + y;
		case "-":
			resultado = x - y;
			break;
		case "*":
			resultado = x * y;
			break;
		case "/":
			if (y == 0)
				resultado = 0;
			else
				resultado = x / y;
			break;
		}
		return resultado;
	}
	public double calcular(byte[] xBinario, byte[] yBinario, String op) {
		double resultado = 0;
		String xBinarioString = "";
		for(byte x : xBinario) {
			xBinarioString += x;
		}
		String yBinarioString = "";
		for(byte y : yBinario) {
			yBinarioString += y;
		}
		int x = Integer.parseInt(xBinarioString, 2);
		int y = Integer.parseInt(yBinarioString, 2);
		switch (op) {
		case "+":
			resultado = x + y;
		case "-":
			resultado = x - y;
			break;
		case "*":
			resultado = x * y;
			break;
		case "/":
			if (y == 0)
				resultado = 0;
			else
				resultado = x / y;
			break;
		}
		return resultado;
	}
	public double calcular(long x, long y, String op) {
		double resultado = 0;
		switch (op) {
		case "+":
			resultado = x + y;
		case "-":
			resultado = x - y;
			break;
		case "*":
			resultado = x * y;
			break;
		case "/":
			if (y == 0)
				resultado = 0;
			else
				resultado = x / y;
			break;
		}
		return resultado;
	}
	public double calcular(Double x, Double y, String op) {
		double resultado = 0;
		switch (op) {
		case "+":
			resultado = x + y;
		case "-":
			resultado = x - y;
			break;
		case "*":
			resultado = x * y;
			break;
		case "/":
			if (y == 0)
				resultado = 0;
			else
				resultado = x / y;
			break;
		}
		return resultado;
	}
	public double calcular(String x1, String y2, String op) {
		double resultado = 0;
		double x = Double.parseDouble(x1);
		double y = Double.parseDouble(y2);
		switch (op) {
		case "+":
			resultado = x + y;
		case "-":
			resultado = x - y;
			break;
		case "*":
			resultado = x * y;
			break;
		case "/":
			if (y == 0)
				resultado = 0;
			else
				resultado = x / y;
			break;
		}
		return resultado;
	}
}

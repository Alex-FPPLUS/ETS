package figuras;

public class Circunferencia {
	private static final double PI = 3.1416;
	private double radio;
	private String color;
	private static double calcularArea;

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public void imprimir() {
		color = "rojo";
		System.out.println("Diámetro: " + 2 * radio);
		System.out.println("Color: " + color);
		calcularArea = 2 * PI * radio * radio;
		System.out.println(calcularArea);
	}

	public boolean esIgual(Circunferencia otro, boolean conDecimales) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}

	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}

	
}

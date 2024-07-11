package Logica;

public abstract class Vehiculo {
	
	protected int velocidadActual = 0;
	protected int velocidadMaxima = 0;
	
	public Vehiculo(int velocidadActual, int velocidadMaxima) {
		
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
	}

	public abstract void acelerar(int velocidad);

	public abstract void frenar(int velocidad);

	public void imprimir() {
		
		System.out.println("Velocidad Actual: " + this.velocidadActual);
		System.out.println("Velocidad Maxima: " + this.velocidadMaxima);
	}
}

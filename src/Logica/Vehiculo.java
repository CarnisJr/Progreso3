package Logica;

public abstract class Vehiculo implements VehiculoInterfaz {
	
	protected double velocidadActual = 0;
	protected double velocidadMaxima = 0;
	protected String tipoVehiculo = "";
	
	public Vehiculo(double velocidadActual, double velocidadMaxima) {
		
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
	
		this.tipoVehiculo = tipoVehiculo;
	}

	@Override
	public void acelerar(double velocidad) {
		
		System.out.println("No acelera");
	}

	@Override
	public void frenar(double velocidad) {
		
		System.out.println("No frena");
	}

	@Override
	public void imprimir() {
		
		System.out.println("Velocidad Actual: " + this.velocidadActual);
		System.out.println("Velocidad Maxima: " + this.velocidadMaxima);
		System.out.println("Tipo de Vehiculo: " + this.tipoVehiculo);
	}
	
	public abstract double calcularRevolucionesMotor(double fuerza, double radio);
	
	public abstract void recomendarVelocidad(double velocidadViento);
}

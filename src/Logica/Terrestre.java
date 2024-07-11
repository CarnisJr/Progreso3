package Logica;

public class Terrestre extends Vehiculo{

	protected double revolucionesMotor = 0;
	
	public Terrestre(double velocidadActual, double velocidadMaxima) {
		
		super(velocidadActual, velocidadMaxima);
	}
	
	@Override
	public void acelerar(double velocidad) {
		
		System.out.println("El terrestre esta acelerando");
	}

	@Override
	public void frenar(double velocidad) {
		
		System.out.println("El terrestre esta frenando");
	}
	
	@Override
	public double calcularRevolucionesMotor(double fuerza, double radio) {
		
		this.revolucionesMotor = (1000 * fuerza) / (PI * radio);
		
		return this.revolucionesMotor;
	}

	public void recomendarVelocidad(double velocidadViento) {
		
	}
}

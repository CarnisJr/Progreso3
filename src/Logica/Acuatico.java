package Logica;

public class Acuatico extends Vehiculo{

	protected double velocidadViento = 0;
	protected double revolucionesMotor = 0;
	
	public Acuatico(double velocidadActual, double velocidadMaxima) {
		
		super(velocidadActual, velocidadMaxima);
	}
	
	@Override
	public void acelerar(double velocidad) {
		
		System.out.println("El acuatico esta acelerando");
	}

	@Override
	public void frenar(double velocidad) {
		
		System.out.println("El acuatico esta frenando");
	}
	
	@Override
	public double calcularRevolucionesMotor(double fuerza, double radio) {
		
		this.revolucionesMotor = (1000 * fuerza) / (PI * radio);
		
		return this.revolucionesMotor;
	}
	
	@Override
	public void recomendarVelocidad(double velocidadViento) {
		
		double velocidadRecomendable = 0;
		
		velocidadRecomendable = velocidadViento * 0.25;
		System.out.println("la velocidad recomendada es: " + (velocidadViento) + ". Por lo tanto la velocidad recomendable es: " + velocidadRecomendable);
	}
}

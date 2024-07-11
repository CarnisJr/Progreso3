package Logica;

public class Acuatico extends Vehiculo{

	public Acuatico(int velocidadActual, int velocidadMaxima) {
		
		super(velocidadActual, velocidadMaxima);
	}
	
	@Override
	public void acelerar(int velocidad) {
		
		System.out.println("El acuatico esta acelerando");
	}

	@Override
	public void frenar(int velocidad) {
		
		System.out.println("El acuatico esta frenando");
	}
	
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		
		return fuerza * radio;
	}
	
	public void recomendarVelocidad(int velocidadViento) {
		
		System.out.println("la velocidad recomendada es: " + (velocidadViento * 3));
	}
}

package Logica;

public class Terrestre extends Vehiculo{

	public Terrestre(int velocidadActual, int velocidadMaxima) {
		
		super(velocidadActual, velocidadMaxima);
	}
	
	@Override
	public void acelerar(int velocidad) {
		
		System.out.println("El terrestre esta acelerando");
	}

	@Override
	public void frenar(int velocidad) {
		
		System.out.println("El terrestre esta frenando");
	}
	
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		
		return fuerza * radio;
	}
}

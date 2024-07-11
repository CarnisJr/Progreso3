package Logica;

public class Camion extends Terrestre{
	
	private double cargaActual = 0;
	private double cargaMaxima = 0;

	public Camion(double velocidadActual, double velocidadMaxima, int cargaActual, int cargaMaxima, String tipoVehiculo) {
		
		super(velocidadActual, velocidadMaxima);
		this.cargaActual = cargaActual;
		this.cargaMaxima = cargaMaxima;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	@Override
	public void imprimir() {
		
		System.out.println("Tipo Vehiculo: " + this.tipoVehiculo);
		System.out.println("Velocidad Actual: " + this.velocidadActual);
		System.out.println("Velocidad Maxima: " + this.velocidadMaxima);
		System.out.println("Carga Actual: " + this.velocidadMaxima);
		System.out.println("Carga Maxima: " + this.velocidadMaxima);
	}
	
	
}

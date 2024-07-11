package Logica;

public class BarcoVela extends Acuatico{

	private int numMastiles = 0;
	private String tipoDeUso = "";

	public BarcoVela(double velocidadActual, double velocidadMaxima, String tipoDeUso, int numMastiles, String tipoVehiculo) {
		
		super(velocidadActual, velocidadMaxima);
		this.tipoDeUso = tipoDeUso;
		this.numMastiles = numMastiles;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	@Override
	public void imprimir() {
		
		System.out.println("Tipo Vehiculo: " + this.tipoVehiculo);
		System.out.println("Tipo de uso: " + this.tipoDeUso);
		System.out.println("Velocidad Actual: " + this.velocidadActual);
		System.out.println("Velocidad Maxima: " + this.velocidadMaxima);
		System.out.println("Numero de Mastiles: " + this.numMastiles);
	}
	

}

package Logica;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Vehiculo arrayVehiculo[] = new Vehiculo[2];

		agregarVehiculos(arrayVehiculo, 0);
		agregarVehiculos(arrayVehiculo, 1);
		
		for(int i = 0; i < arrayVehiculo.length; i++) {
			
			if(arrayVehiculo[i] != null) {
				
				arrayVehiculo[i].imprimir();
				if(arrayVehiculo[i] instanceof Camion) {
					
					//fuerza y radio
					revolucionesMostrar(arrayVehiculo, i);
				}else if(arrayVehiculo[i] instanceof BarcoVela) {
					
					//Velocidad del viento
					mostrarVelocidadRecomendada(arrayVehiculo, i);
				}
			}else {
				
				System.out.println("No existe objeto en esta posicion");
			}
		}
	}
	
	public static void mostrarVelocidadRecomendada(Vehiculo array[], int index) {
		
		double velocidadViento = 0;
		try {
			
			System.out.println("Ingrese velocidad del viento: ");
			velocidadViento = scan.nextDouble();
			array[index].recomendarVelocidad(velocidadViento);;
		}catch (Exception e){
			
			System.out.println("Algo salio mal: " + e);
		}
	}
	
	public static void revolucionesMostrar(Vehiculo array[], int index) {
		
		double radio = 0;
		double fuerza = 0;

		try {
			
			System.out.println("Ingrese fuerza: ");
			fuerza = scan.nextDouble();
			System.out.println("Ingrese el radio de la llanta: ");
			radio = scan.nextDouble();
			System.out.println("Las revoluciones del motor son: " + array[index].calcularRevolucionesMotor(fuerza, radio));

		}catch (Exception e){
			
			System.out.println("Algo salio mal: " + e);
		}

	}
	
	public static Vehiculo crearCamion() {
		
		//Variables para vehiculo general
		double velocidadActual = 0;
		double velocidadMaxima = 0;
		String tipoVehiculo = "Camion";

		//Variables para camion
		int cargaActual = 0;
		int cargaMaxima = 0;
		
		try {
			
			System.out.println("Velocidad actual del camion: ");
			velocidadActual = scan.nextDouble();
			System.out.println("Velocidad maxima del camion: ");
			velocidadMaxima = scan.nextDouble();
			System.out.println("Carga maxima del camion: ");
			cargaMaxima = scan.nextInt();
			System.out.println("Carga actual del camion: ");
			cargaActual = scan.nextInt();
			
			Vehiculo camion1 = new Camion(velocidadActual, velocidadMaxima, cargaActual, cargaMaxima, tipoVehiculo);
			
			return camion1;
		}catch(Exception e) {
			
			System.out.println("Algo salio mal: " + e);
			return null;
		}
	}
	
	public static Vehiculo crearVelero() {
		
		//Variables para vehiculo general
		double velocidadActual = 0;
		double velocidadMaxima = 0;
		String tipoVehiculo = "Velero";

		//Variables para velero
		//Variables para velero
		double velocidadViento = 0;
		String tipoDeUso = "";
		int numMastiles = 0;
		
		try {
			
			System.out.println("Velocidad actual del velero: ");
			velocidadActual = scan.nextDouble();
			System.out.println("Velocidad maxima del velero: ");
			velocidadMaxima = scan.nextDouble();
			System.out.println("Numero de mastiles: ");
			numMastiles = scan.nextInt();
			System.out.println("Tipo de uso: ");
			tipoDeUso = scan.next();
			
			Vehiculo velero = new BarcoVela(velocidadActual, velocidadMaxima, tipoDeUso, numMastiles, tipoVehiculo);
			
			return velero;
		}catch(Exception e) {
			
			System.out.println("Algo salio mal: " + e);
			return null;
		}
	}

	public static void agregarVehiculos(Vehiculo array[], int index) {
		
		int selector = 0;
		
		System.out.println("Ingrese dos vehiculos: ");
		System.out.println("1. Camion");
		System.out.println("2. Velero");
		
		try {
			
			selector = scan.nextInt();

			if(selector == 1) {
				
				array[index] = crearCamion();
			}else if(selector == 2) {
				
				array[index] = crearVelero();
			}else { 
				
				throw new ArithmeticException("No existe esa opcion");
			}
			
		}catch(InputMismatchException e) {
			
			System.out.println("Solo se permite el ingreso de numeros enteros positivos");
		}catch(Exception error) {
			
			System.out.println("Algo salio mal: " + error);
		}
		
		
	}
}


package Carrera_Autos_POO;

public class vueltas {

	private int cant_vueltas;
	private int carros;
	private double velocidad;
	private double promedio;
	
	public vueltas(int cat_vueltas, int carros, double velocidad, double promedio) {
			this.cant_vueltas = cant_vueltas;
			this.carros = carros;
			this.velocidad = velocidad;
			this.promedio = promedio;
	}

	public int getCant_vueltas() {
		return cant_vueltas;
	}

	public void setCant_vueltas(int cant_vueltas) {
		this.cant_vueltas = cant_vueltas;
	}

	public int getCarros() {
		return carros;
	}

	public void setCarros(int carros) {
		this.carros = carros;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	
	}
	
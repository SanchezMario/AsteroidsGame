package com.example.asteroides;

import java.util.Vector;

public class AlmacenPuntuacionesArray implements AlmacenPuntuaciones {

	private Vector<String> puntuaciones;

	public AlmacenPuntuacionesArray() {
		puntuaciones = new Vector<String>();
		puntuaciones.add("124000 Aitor Sanchez");
		puntuaciones.add("100000 Maikel Sanchez");
		puntuaciones.add("10000 Pepito Perez");
	}

	@Override
	public void guardarPuntuacion(int puntos, String nombre, long fecha) {

		puntuaciones.add(0, puntos + " " + nombre);

	}

	@Override
	public Vector<String> listaPuntuaciones(int cantidad) {
		// TODO Auto-generated method stub
		return puntuaciones;
	}

}

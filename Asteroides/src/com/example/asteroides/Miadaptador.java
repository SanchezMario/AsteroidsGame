package com.example.asteroides;

import java.util.StringTokenizer;
import java.util.Vector;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Miadaptador extends BaseAdapter {

	private final Activity actividad;
	private final Vector<String> lista;

	public Miadaptador(Activity actividad, Vector<String> lista) {
		super();
		this.actividad = actividad;
		this.lista = lista;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lista.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return lista.elementAt(arg0);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = actividad.getLayoutInflater();
		View view = inflater.inflate(R.layout.elemento_lista, null, true);
		TextView textview = (TextView) view.findViewById(R.id.titulo);
		String texto = lista.elementAt(position);
		StringTokenizer tokens = new StringTokenizer(texto);
		int puntuacion = Integer.valueOf(tokens.nextToken());
		
		textview.setText(texto);
		ImageView icono = (ImageView)view.findViewById(R.id.icono);
		
		if(puntuacion<=10000){
			icono.setImageResource(R.drawable.asteroide1);
		}else if (puntuacion>10000 && puntuacion<=100000){
			icono.setImageResource(R.drawable.asteroide2);
		}else{
			icono.setImageResource(R.drawable.asteroide3);
		}
		
		return view;
	}

}

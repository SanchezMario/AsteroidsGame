package com.example.asteroides;

import android.R.layout;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Puntuaciones extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puntuaciones);
		setListAdapter(new ArrayAdapter<String>(this,
				R.layout.elemento_lista,
				R.id.titulo,
				Asteroides.almacen.listaPuntuaciones(10)));
	}

}

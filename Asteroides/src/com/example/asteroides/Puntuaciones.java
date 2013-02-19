package com.example.asteroides;

import android.app.ListActivity;
import android.os.Bundle;

public class Puntuaciones extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puntuaciones);
		setListAdapter(new Miadaptador(this, Asteroides.almacen.listaPuntuaciones(10)));
				
	}

}

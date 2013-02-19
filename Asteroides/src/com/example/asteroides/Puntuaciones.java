package com.example.asteroides;

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
				android.R.layout.simple_list_item_1,
				Asteroides.almacen.listaPuntuaciones(10)));
	}

}

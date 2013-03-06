package com.example.asteroides;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Puntuaciones extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puntuaciones);
		setListAdapter(new Miadaptador(this, Asteroides.almacen.listaPuntuaciones(10)));
				
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Object o = getListAdapter().getItem(position);
		Toast.makeText(this, "Selección: "+ Integer.toString(position)+" - "+o.toString(), Toast.LENGTH_LONG).show(); 
	}

}

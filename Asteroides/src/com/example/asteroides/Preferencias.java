/*actividad de preferencias*/
package com.example.asteroides;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferencias extends PreferenceActivity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferencias);

		// Para acceder a las preferencias mediantecodigo java...

		// super.onCreate(savedInstanceState);
		// SharedPreferences pref =
		// getSharedPreferences("com.example.asteroides_prefereces",MODE_PRIVATE);
		// String s = "musica: "+pref.getBoolean("musica", true)+
		// ", graficos: "+ pref.getString("graficos", "1")+", fragmentos"+
		// pref.getString("fragmentos", "3");
		//

	}
}

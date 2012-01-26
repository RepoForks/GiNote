package com.dayosoft.quicknotes;

import com.dayosoft.utils.DialogUtils;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class Options extends Activity {

	SharedPreferences prefs;
	EditText suffixField;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);
		prefs = getSharedPreferences("ginote_settings", MODE_PRIVATE);
		CheckBox useGPS = (CheckBox) findViewById(R.id.UseGPS);
		CheckBox autoAddNote = (CheckBox) findViewById(R.id.autoAddNote);
		DialogUtils.linkBoxToPrefs(useGPS, prefs, "use_gps");
		DialogUtils.linkBoxToPrefs(autoAddNote, prefs, "auto_add_note");
	}
	
	
}

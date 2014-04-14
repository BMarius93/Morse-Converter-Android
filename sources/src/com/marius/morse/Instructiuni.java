package com.marius.morse;

import com.marius.morse.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Instructiuni extends Activity {

	ImageButton backButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_instructiuni);
		backButton = (ImageButton) findViewById(R.id.backButton);

		
		//Ends current activity and starts MainActivity
		backButton.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Instructiuni.this, MainActivity.class);
				startActivity(i);
				finish();

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.instructiuni, menu);
		return true;
	}

}

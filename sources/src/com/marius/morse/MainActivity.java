package com.marius.morse;

import java.io.IOException;

import com.marius.morse.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	int index = -1;
	EditText et;
	String text;
	ImageButton playButton;
	ImageButton exitButton;
	ImageButton sosButton;
	ImageButton instructionsButton;
	MediaPlayer morseSound;
	MediaPlayer mp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et = (EditText) findViewById(R.id.edit);
		playButton = (ImageButton) findViewById(R.id.playButton);
		instructionsButton = (ImageButton) findViewById(R.id.instructionsButton);
		sosButton = (ImageButton) findViewById(R.id.sosButton);
		exitButton = (ImageButton) findViewById(R.id.exitButton);

		instructionsButton.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(MainActivity.this, Instructiuni.class);
				startActivity(i);
				finish();

			}
		});

		//The SOS button plays in a continuous loop once is pressed
		//and stops at the second press of the button.
		sosButton.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				if (morseSound == null) {
					morseSound = MediaPlayer.create(getApplicationContext(),
							R.raw.morse);
				}

				if (morseSound.isPlaying()) {
					morseSound.stop();
					try {
						morseSound.prepare();
					} catch (IllegalStateException e) {

						e.printStackTrace();
					} catch (IOException e) {

						e.printStackTrace();
					}
					morseSound.seekTo(0);
				} else {
					morseSound.setLooping(true);
					morseSound.start();
				}

			}
		});

		exitButton.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {

				finish();
				System.exit(0);

			}
		});

		playButton.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {

				text = et.getText().toString().toLowerCase();
				
				//For each letter of the text, it starts the sound and sleeps for the
				//sound to stop
				
				while (index < text.length() - 1) {
					index++;
					try {
						if (text.charAt(index) == 'a') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.a);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;

						}

						if (text.charAt(index) == 'b') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.b);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'c') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.c);
							mp.start();
							Thread.sleep(1350);
							mp.release();
							continue;

						}

						if (text.charAt(index) == 'd') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.d);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'e') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.e);
							mp.start();
							Thread.sleep(600);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'f') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.f);
							mp.start();
							Thread.sleep(1050);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'g') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.g);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'h') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.h);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'i') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.i);
							mp.start();
							Thread.sleep(800);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'j') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.j);
							mp.start();
							Thread.sleep(1350);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'k') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.k);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'l') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.l);
							mp.start();
							Thread.sleep(1100);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'm') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.m);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'n') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.n);
							mp.start();
							Thread.sleep(900);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'o') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.o);
							mp.start();
							Thread.sleep(1200);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'p') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.p);
							mp.start();
							Thread.sleep(1250);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'q') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.q);
							mp.start();
							Thread.sleep(1300);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'r') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.r);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 's') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.s);
							mp.start();
							Thread.sleep(900);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 't') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.t);
							mp.start();
							Thread.sleep(750);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'u') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.u);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'v') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.v);
							mp.start();
							Thread.sleep(1100);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'w') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.w);
							mp.start();
							Thread.sleep(1000);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'x') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.x);
							mp.start();
							Thread.sleep(1250);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'y') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.y);
							mp.start();
							Thread.sleep(1300);
							mp.release();
							continue;
						}

						if (text.charAt(index) == 'z') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.z);
							mp.start();
							Thread.sleep(1250);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '1') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.unu);
							mp.start();
							Thread.sleep(1800);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '2') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.doi);
							mp.start();
							Thread.sleep(1750);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '3') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.trei);
							mp.start();
							Thread.sleep(1600);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '4') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.patru);
							mp.start();
							Thread.sleep(1550);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '5') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.cinci);
							mp.start();
							Thread.sleep(1500);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '6') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.sase);
							mp.start();
							Thread.sleep(1550);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '7') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.sapte);
							mp.start();
							Thread.sleep(1600);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '8') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.opt);
							mp.start();
							Thread.sleep(1750);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '9') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.noua);
							mp.start();
							Thread.sleep(1800);
							mp.release();
							continue;
						}

						if (text.charAt(index) == '0') {

							mp = MediaPlayer.create(getApplicationContext(),
									R.raw.zero);
							mp.start();
							Thread.sleep(1850);
							mp.release();
							continue;
						}

						if (text.charAt(index) == ' ') {

							Thread.sleep(700);
							continue;
						}
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

				}
				index = -1;

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

package com.example.helpershand;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText e1, e2, e3;
	Button b1, b2, b3;
	String user = "admin";
	String pass = "123";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		e1 = (EditText) findViewById(R.id.editText1);
		e2 = (EditText) findViewById(R.id.editText2);
		e3 = (EditText) findViewById(R.id.editText3);
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3=  (Button)findViewById(R.id.button3);
		
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if ((e1.getText().toString().equalsIgnoreCase(user))
						&& (e2.getText().toString().equalsIgnoreCase(pass))) {
					Intent i = new Intent(getApplicationContext(), third.class);
					startActivity(i);
					Toast.makeText(getApplicationContext(), "DATA SAVE",
							Toast.LENGTH_LONG).show();
				} else
					Toast.makeText(getApplicationContext(), "WRONG PASSWORD",
							Toast.LENGTH_LONG).show();

			}
		});
		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii = new Intent(MainActivity.this, second.class);
				startActivity(ii);

			}
		});
		b3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent c = new Intent(MainActivity.this, tenth.class);
				startActivity(c);
			}
		});

	}

}

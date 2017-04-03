package com.example.helpershand;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class abc extends Activity {
	ImageView i1,i2,i3,i4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abc);
		i1=(ImageView)findViewById(R.id.imageView1);
		i2=(ImageView)findViewById(R.id.imageView2);
		i3=(ImageView)findViewById(R.id.imageView3);
		i4=(ImageView)findViewById(R.id.imageView4);
		
	}

}


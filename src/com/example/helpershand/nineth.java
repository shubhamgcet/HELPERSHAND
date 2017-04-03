package com.example.helpershand;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class nineth extends Activity{
	ImageView i1,i2;
	TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nineth);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		t3=(TextView)findViewById(R.id.textView3);
		t4=(TextView)findViewById(R.id.textView4);
		t5=(TextView)findViewById(R.id.textView5);
		t6=(TextView)findViewById(R.id.textView6);
		t7=(TextView)findViewById(R.id.textView7);
		t8=(TextView)findViewById(R.id.textView8);
		t9=(TextView)findViewById(R.id.textView9);
		t10=(TextView)findViewById(R.id.textView10);
		t11=(TextView)findViewById(R.id.textView11);
		i1=(ImageView)findViewById(R.id.imageView1);
		i2=(ImageView)findViewById(R.id.imageView2);
	}
	

}


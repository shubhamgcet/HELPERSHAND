package com.example.helpershand;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.Switch;

public class third extends Activity{
	ImageButton i1,i2,i3,i4,i5,i6;
	Switch s;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		i1=(ImageButton)findViewById(R.id.imageButton1);
		i2=(ImageButton)findViewById(R.id.imageButton2);
		i3=(ImageButton)findViewById(R.id.imageButton3);
		i4=(ImageButton)findViewById(R.id.imageButton4);
		i5=(ImageButton)findViewById(R.id.imageButton5);
		i6=(ImageButton)findViewById(R.id.imageButton6);
		i1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a=new Intent(third.this,fourth.class);
				startActivity(a);
				
			}
		});
		i2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent aa=new Intent(third.this,fifth.class);
				startActivity(aa);
			}
		});
		i3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent b=new Intent(third.this,sixth.class);
			startActivity(b);
			}
		});
		i4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent bb=new Intent(third.this,seventh.class);
			startActivity(bb);
			}
		});
		i5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent c=new Intent(third.this,eight.class);
				startActivity(c);
			}
		
		});
		i6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent cc=new Intent(third.this,nineth.class);
			startActivity(cc);
			}
		});
		
		s=(Switch)findViewById(R.id.switch1);
		s.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(arg1)
				{
					Intent i=new Intent(getApplicationContext(),abc.class);
					startActivity(i);
				}
				else
				{
					Intent ii=new Intent(getApplicationContext(),third.class);
					startActivity(ii);
				}
				
			}
			
		});
	}
	

}

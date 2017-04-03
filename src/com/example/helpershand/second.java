package com.example.helpershand;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class second extends Activity {
	EditText e1,e2,e3,e4,e5;
	RadioButton r1,r2;
	Button b1;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e5=(EditText)findViewById(R.id.editText5);
        r1=(RadioButton)findViewById(R.id.radioButton1);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder mj=new AlertDialog.Builder(second.this);
				mj.setTitle("CONFIRMATION");
				mj.setMessage("ARE YOU SURE YOU WANT TO SUBMIT");
				mj.setPositiveButton("YES", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Toast.makeText(getApplicationContext(), "DATA SAVE", Toast.LENGTH_SHORT ).show();
						second.this.finish();	
					}
				});
				mj.setNegativeButton("NO", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Toast.makeText(getApplicationContext(), "DATA NOT SAVED", Toast.LENGTH_LONG).show();
						arg0.cancel();
					}
				});
		        
				// TODO Auto-generated method stub
				mj.show();
			}
		});
			
        
	}
	public void save (View v)
	{
		SharedPreferences sp=getSharedPreferences("mydat",Context.MODE_PRIVATE);
		SharedPreferences.Editor editor=sp.edit();
		editor.putString("name",e1.getText().toString());
		editor.putString("password",e2.getText().toString());
		editor.putString("confirm password",e3.getText().toString());
		editor.putString("email id",e4.getText().toString());
		editor.putString("phone number",e5.getText().toString());
		editor.putString("male",r1.getText().toString());
		editor.putString("female",r2.getText().toString());
		editor.commit();
		if(e2.getText()==e3.getText())
		{
		Toast.makeText(getApplicationContext(), "PASSWORD DID NOT MATCH",Toast.LENGTH_LONG).show();
		}
		else
		Toast.makeText(getApplicationContext(),"DATA SAVE", Toast.LENGTH_LONG).show();
		
	}
}

package com.example.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText editCentimeters = (EditText) findViewById(R.id.editCentimeters);
        final EditText editInches = (EditText) findViewById(R.id.editInches);
        Button buttonConvert = (Button) findViewById(R.id.buttonConvert);
        
        buttonConvert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(editCentimeters.getText().toString() != "")
				{
				   double centimeters = Double.valueOf(editCentimeters.getText().toString());
				   double inches = centimeters * 0.393700787; //Double.valueOf(editInches.getText().toString());
				   editInches.setText(String.valueOf(inches));
				}   
			}
		});
    }

/* Not needed
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
  */  
}

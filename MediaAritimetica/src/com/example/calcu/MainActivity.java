package com.example.calcu;

import java.text.DecimalFormat;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText nota1;
	EditText nota2;
	EditText nota3;
	TextView media;
	TextView aprovacao;
	Double n1;
	Double n2;
	Double n3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		nota1 = (EditText) findViewById(R.id.nota1);
		nota2 = (EditText) findViewById(R.id.nota2);
		nota3 = (EditText) findViewById(R.id.nota3);
		media = (TextView) findViewById(R.id.lblMedia);
		aprovacao = (TextView) findViewById(R.id.lblAprovacao);
		
	}
	
	public void btnMediaClick(View v){
		
		n1 = Double.parseDouble(nota1.getText().toString());
		n2 = Double.parseDouble(nota2.getText().toString());
		n3 = Double.parseDouble(nota3.getText().toString());
		
		DecimalFormat decimal = new DecimalFormat( "0.00" );
	
		Double dMedia = (n1+n2+n3) / 3;
		
		media.setText("Media: " + decimal.format(dMedia));
		
		if (dMedia >= 6){
			aprovacao.setText("Aprovado");
			aprovacao.setTextColor(Color.GREEN);
		}else{
			aprovacao.setText("Reprovado");
			aprovacao.setTextColor(Color.RED);
		}
		
		InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(nota3.getWindowToken(), 0);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

	}


}

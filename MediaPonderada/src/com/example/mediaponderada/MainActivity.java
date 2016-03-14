package com.example.mediaponderada;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText edtNota1;
	EditText edtNota2;
	EditText edtNota3;
	TextView lblMedia;
	TextView lblAprovacao;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edtNota1 = (EditText) findViewById(R.id.nota1);
		edtNota2 = (EditText) findViewById(R.id.nota2);
		edtNota3 = (EditText) findViewById(R.id.nota3);
		lblMedia = (TextView) findViewById(R.id.lblMedia);
		lblAprovacao = (TextView) findViewById(R.id.lblAprovacao);
		
	}

	public void btnMediaClick(View v){

		Double n1 = Double.parseDouble(edtNota1.getText().toString());
		Double n2 = Double.parseDouble(edtNota1.getText().toString());
		Double n3 = Double.parseDouble(edtNota3.getText().toString());

		Double mediaAritimetica = (((n1*1) + (n2*2) + (n3*3)) / (1 + 2 + 3));

		lblMedia.setText("Média: " + mediaAritimetica);

		if (mediaAritimetica >= 6){
			lblAprovacao.setText("Aprovado");
			lblAprovacao.setTextColor(Color.GREEN);
		}else{
			lblAprovacao.setText("Reprovado");
			lblAprovacao.setTextColor(Color.RED);
		}

		InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(edtNota3.getWindowToken(), 0);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

	}
}

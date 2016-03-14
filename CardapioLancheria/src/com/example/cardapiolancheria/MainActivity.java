package com.example.cardapiolancheria;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText edtCodigo;
	EditText edtQtd;
	TextView lblVlrTotal;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edtCodigo = (EditText) findViewById(R.id.codLanche);
		edtQtd = (EditText) findViewById(R.id.edtQtd);
		lblVlrTotal = (TextView) findViewById(R.id.vlrTotal);
	}


	public void btnOK(View v){
		
		int cod = Integer.parseInt(edtCodigo.getText().toString());
		int qtd = Integer.parseInt(edtQtd.getText().toString());
		
		Double preco = (double) 0;
		
		if (cod == 100)
			preco = 1.50;
		else if (cod == 101)
			preco = 2.00;
		else if (cod == 102)
			preco = 2.30;
		else if (cod == 103)
			preco = 2.00;
		else if (cod == 104)
			preco = 2.40;
		else if (cod == 105)
			preco = 1.50;
		

		Double vlrTotal = (qtd * preco);
		
		
		lblVlrTotal.setText("R$" + vlrTotal);
	}
	
}

package com.example.precoproduto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	EditText txtCodProd;
	EditText txtQtdProd;
	TextView lblVlrTotal;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		txtCodProd = (EditText) findViewById(R.id.txtCodProd);
		txtQtdProd = (EditText) findViewById(R.id.txtQtdProd);
		lblVlrTotal = (TextView) findViewById(R.id.lblVlrTotal);

	}

	public void btnOkClick(View v){

		String cod = txtCodProd.getText().toString();
		Double qtd = Double.parseDouble(txtQtdProd.getText().toString());

		Double preco = 0.0;
		if (cod == "1001")
			preco = 5.32;
		else if (cod == "1324")
			preco = 6.45;
		else if (cod == "6548")
			preco = 2.37;
		else if (cod == "0987")
			preco = 5.32;
		else if (cod == "7623")
			preco = 6.45;

		lblVlrTotal.setText("Valor total: " + qtd * preco);

	}

}
 
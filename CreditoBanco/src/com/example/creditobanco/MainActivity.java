package com.example.creditobanco;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText txtSaldo;
	TextView lblSaldo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtSaldo = (EditText) findViewById(R.id.txtSaldoMedio);
		lblSaldo = (TextView) findViewById(R.id.lblSaldo);
	}

	public void btnSaldo(View v){
		
		Double saldo = Double.parseDouble(txtSaldo.getText().toString());
		
		Double credito;
		
		if((saldo>=0) && (saldo<=200)){
			lblSaldo.setText("Crédito : nenhum");
		}else if ((saldo>=201) && (saldo<=400)){
			credito =  (saldo * 20) / 100;
			lblSaldo.setText("Crédito : " + credito);
		}else if ((saldo>=401) && (saldo<=600)){
			credito =  (saldo * 30) / 100;
			lblSaldo.setText("Crédito : " + credito);
		}else if (saldo>=601){
			credito =  (saldo * 40) / 100;
			lblSaldo.setText("Crédito : " + credito);
		}

	}
}

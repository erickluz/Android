package com.example.paridade;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText edtParidade;
	TextView lblParidade;
	TextView lblPositividade;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edtParidade = (EditText) findViewById(R.id.edtNumero);
		lblParidade = (TextView) findViewById(R.id.lblParidade);
		lblPositividade = (TextView) findViewById(R.id.lblPositivo);

	}

	public void btnParidade(View v) {

		int num = Integer.parseInt(edtParidade.getText().toString());

		if ((num % 2) == 0)
			lblParidade.setText("Par");
		else
			lblParidade.setText("Impar");

		if (num >= 0) {
			lblPositividade.setText("Positivo");
			lblPositividade.setTextColor(Color.GREEN);
		} else {
			lblPositividade.setText("Negativo");
			lblPositividade.setTextColor(Color.RED);
		}

	}

}

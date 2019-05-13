package com.example.fina.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnBorrar,btnDividir,btnSiete,btnOcho,btnNueve,btnMultiplicar,btnCuatro,btnCinco,btnSeis,btnMenos,btnUno,btnDos,
            btnTres,btnMas,btnCero,btnIgual,btnSalir;
    private TextView lblResultado, lblOperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final double[] resultado = {0};
        final double[] a ={0};
        final String[] num = {""};
        final double[] b ={0};
        final boolean[] flag = {false};

        btnBorrar=(Button)findViewById(R.id.btnBorrar);
        btnSalir=(Button)findViewById(R.id.btnSalir);
        btnDividir=(Button)findViewById(R.id.btnDividir);
        btnSiete=(Button)findViewById(R.id.btnSiete);
        btnOcho=(Button)findViewById(R.id.btnOcho);
        btnNueve=(Button)findViewById(R.id.btnNueve);
        btnMultiplicar=(Button)findViewById(R.id.btnMultiplicar);
        btnCuatro=(Button)findViewById(R.id.btnCuatro);
        btnCinco=(Button)findViewById(R.id.btnCinco);
        btnSeis=(Button)findViewById(R.id.btnSeis);
        btnMenos=(Button)findViewById(R.id.btnMenos);
        btnUno=(Button)findViewById(R.id.btnUno);
        btnDos=(Button)findViewById(R.id.btnDos);
        btnTres=(Button)findViewById(R.id.btnTres);
        btnMas=(Button)findViewById(R.id.btnMas);
        btnCero=(Button)findViewById(R.id.btnCero);
        btnIgual=(Button)findViewById(R.id.btnIgual);
        lblResultado=(TextView) findViewById(R.id.lblResultado);
        lblOperacion =(TextView) findViewById(R.id.lblResultadoFinal);

        lblResultado.setText("0");

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("1");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]);
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("2");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]) ;
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("3");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]) ;
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("4");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]) ;
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("5");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]) ;
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("6");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]) ;
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("7");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]) ;
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("8");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]) ;
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("9");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]) ;
            }
        });
        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString().equals("")&&flag[0]==true){
                    lblResultado.setText("0");
                    lblOperacion.setText("");
                    resultado[0] =0;
                    num[0]="";
                    a[0]=0;
                    flag[0]=false;
                }
                lblResultado.setText("0");
                num[0] = num[0] +lblResultado.getText().toString();
                lblResultado.setText(num[0]);
                a[0]=Double.valueOf(num[0]) ;
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblOperacion.setText("-");
                b[0] =Double.valueOf(lblResultado.getText().toString());
                num[0]="";
            }
        });
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblOperacion.setText("+");
                b[0] =Double.valueOf(lblResultado.getText().toString());
                num[0]="";
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblOperacion.setText("/");
                b[0] =Double.valueOf(lblResultado.getText().toString());
                num[0]="";
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblOperacion.setText("*");
                b[0] =Double.valueOf(lblResultado.getText().toString());
                num[0]="";
            }
        });
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblResultado.setText("0");
                lblOperacion.setText("");
                resultado[0] =0;
                num[0]="";
                a[0]=0;
                flag[0] =false;
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lblOperacion.getText().toString()=="+"){
                    lblResultado.setText(String.valueOf((int) (Double.valueOf(b[0])+Double.valueOf(lblResultado.getText().toString()))));
                    flag[0] =true;
                }else if(lblOperacion.getText().toString()=="*"){
                    lblResultado.setText(String.valueOf((int) (Double.valueOf(b[0])*Double.valueOf(lblResultado.getText().toString()))));
                    flag[0] =true;
                }else if(lblOperacion.getText().toString()=="-"){
                    lblResultado.setText(String.valueOf((int) (Double.valueOf(b[0])-Double.valueOf(lblResultado.getText().toString()))));
                    flag[0] =true;
                }else if(lblOperacion.getText().toString()=="/"){
                    if(lblResultado.getText().toString().equals("0")){
                        Toast.makeText(MainActivity.this, "No se puede dividir por 0", Toast.LENGTH_SHORT).show();
                    }else {
                        lblResultado.setText(String.valueOf((int) (Double.valueOf(b[0]) / Double.valueOf(lblResultado.getText().toString()))));
                        flag[0] = true;
                    }
                }
                //a[0]=0;
                lblOperacion.setText("");
            }
        });

    }
}

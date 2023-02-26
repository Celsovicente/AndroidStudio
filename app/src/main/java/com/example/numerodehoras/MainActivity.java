package com.example.numerodehoras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numero_de_horas;
    Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero_de_horas = findViewById(R.id.et_numero_de_horas);
        calcular = findViewById(R.id.btn_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero_horas = Integer.parseInt(numero_de_horas.getText().toString());
                int numero_semanas = ((numero_horas / 24) / 7);
                int numero_dias = ((numero_horas % (24 * 7)) / 24);
                int horas = ((numero_horas % (24 * 7)) % 24);

                Toast.makeText(MainActivity.this,numero_de_horas+" equivale á :" +numero_semanas+" semanas"
                        +numero_dias+ " dias" +horas+ " horas",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
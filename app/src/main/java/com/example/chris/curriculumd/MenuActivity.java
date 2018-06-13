package com.example.chris.curriculumd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void irDatospersonales(View view){
        Intent intent = new Intent(this, DatosPersonalesActivity.class);
        startActivity(intent);

    }
    public void irEstudiosRealizados(View view){
        Intent intent = new Intent(this, EstudiosRealizadosActivity.class);
        startActivity(intent);

    }
    public void irExperienciaLaboral(View view){
        Intent intent = new Intent(this, ExperienciaLaboralActivity.class);
        startActivity(intent);

    }
    public void irReferenciaPersonal(View view){
        Intent intent = new Intent(this, ReferenciaPersonalActivity.class);
        startActivity(intent);

    }
}

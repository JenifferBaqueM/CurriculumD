package com.example.chris.curriculumd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EstudiosRealizadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudios_realizados);
    }
    public void irMneu(View view){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);

    }
}

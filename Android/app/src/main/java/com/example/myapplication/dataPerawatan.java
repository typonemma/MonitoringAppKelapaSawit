package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class dataPerawatan extends AppCompatActivity  {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_perawatan);
        Spinner spjenisPupuk = findViewById(R.id.jenisPupuk);
        ArrayAdapter<String> adapter = new ArrayAdapter<>((Context) dataPerawatan.this, android.R.layout.simple_spinner_item, (List) spjenisPupuk);
        adapter.setDropDownViewResource(R.layout.activity_data_perawatan);
        spjenisPupuk.setAdapter(adapter);

    }
}
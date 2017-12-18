package com.cristobal.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView miRecyclerView;
    LinearLayoutManager miLayoutManager;
    Adaptador miAdaptador;
    Datos datos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miRecyclerView = (RecyclerView)findViewById(R.id.idRecyclerView);
        miRecyclerView.setHasFixedSize(true);
        miLayoutManager = new LinearLayoutManager(this);
        miRecyclerView.setLayoutManager(miLayoutManager);

        datos = new Datos();
        miAdaptador = new Adaptador(datos.getLista());

        miAdaptador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Seleccionada la opción " + miRecyclerView.indexOfChild(v) + " tipo animal: "
                        + ((Adaptador.MiViewHolder)miRecyclerView.getChildViewHolder(v)).getTextoSup().getText();
                Toast.makeText(MainActivity.this, msg,Toast.LENGTH_SHORT).show();
            }
        });


        miRecyclerView.setAdapter(miAdaptador);



    }
}

package com.example.gabrielhideki.aplicativoestresse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gabrielhideki.aplicativoestresse.R;

public class Fragment_Modulo1 extends Fragment{

    View rootView;
    Button btnSalvar = (Button) rootView.findViewById(R.id.button2);
    EditText campoTexto = (EditText) rootView.findViewById(R.id.editText);


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fm_modulo1, container, false);

        btnSalvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent it = new Intent(Fragment_Modulo1.this, Modulo1_respiracao.class);
                //startActivity(it);
            }
        });
        return rootView;
    }


}
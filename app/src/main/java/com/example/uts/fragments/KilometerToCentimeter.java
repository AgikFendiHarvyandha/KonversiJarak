package com.example.uts.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.uts.R;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class KilometerToCentimeter extends Fragment {


    public KilometerToCentimeter() {
        // Required empty public constructor
    }

    EditText input_angka;
    TextView hasilCentimeter;
    Button convertKilometer, clearKilometer;
    double Kilometer, Centimeter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kilometer_to_centimeter, container, false);
        input_angka = view.findViewById(R.id.text_kilometer);
        convertKilometer = view.findViewById(R.id.button_convert);
        clearKilometer = view.findViewById(R.id.button_clear);
        hasilCentimeter = view.findViewById(R.id.centimeter);


        convertKilometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kilometer = Double.valueOf(input_angka.getText().toString());
                Centimeter = (Kilometer *100000);
                hasilCentimeter.setText(NumberFormat.getInstance().format(Centimeter));


            }
        });

        clearKilometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_angka.setText(" ");
            }
        });

        return view;
    }

    private class OnFragmentInteractionListener {
    }
}

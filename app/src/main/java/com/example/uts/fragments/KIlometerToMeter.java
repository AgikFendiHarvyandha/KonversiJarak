package com.example.uts.fragments;


import android.hardware.camera2.params.MeteringRectangle;
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
public class KIlometerToMeter extends Fragment {


    public KIlometerToMeter() {
        // Required empty public constructor
    }
    EditText input_angka;
    TextView hasilMeter;
    Button convertKilometer, clearKilometer;
    double Kilometer, Meter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kilometer_to_meter, container, false);
        input_angka = view.findViewById(R.id.text_kilometer_meter);
        convertKilometer = view.findViewById(R.id.button_convert_meter);
        clearKilometer = view.findViewById(R.id.button_clear_meter);
        hasilMeter = view.findViewById(R.id.meter);


        convertKilometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kilometer = Double.valueOf(input_angka.getText().toString());
                Meter = (Kilometer *1000);
                hasilMeter.setText(NumberFormat.getInstance().format(Meter));


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

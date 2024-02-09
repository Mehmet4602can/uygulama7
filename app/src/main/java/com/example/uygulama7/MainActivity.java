package com.example.uygulama7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextMaas,editTextYas;
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMaas = findViewById(R.id.editTextMaas);
        editTextYas = findViewById(R.id.editTextYas);
        textView = findViewById(R.id.textView);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int yas = Integer.parseInt(editTextYas.getText().toString());
                Personel personel = new Personel();
                personel.setYas(yas);

                int maas = Integer.parseInt(editTextMaas.getText().toString());
                personel.setMaas(maas);
                
                textView.setText("yaş: "+ personel.getYas() +" Maaş: " + personel.getMaas());


            }
        });

    }
}
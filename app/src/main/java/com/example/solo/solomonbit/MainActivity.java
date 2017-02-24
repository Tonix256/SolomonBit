package com.example.solo.solomonbit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView so;
    EditText sp;
    Button bt;
    TextView dy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        so=(ImageView)findViewById(R.id.solo);

        sp=(EditText)findViewById(R.id.typ);
        bt=(Button)findViewById(R.id.sub);
        dy=(TextView)findViewById(R.id.dsp);
        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dy.setText("Solomon");
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dy.setText("Data submited");
                sp.setText("");
            }
        });
    }
}

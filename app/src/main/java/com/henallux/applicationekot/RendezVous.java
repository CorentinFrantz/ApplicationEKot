package com.henallux.applicationekot;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * Created by etu22360 on 20/11/2015.
 */
public class RendezVous extends AppCompatActivity {

    private Button buttonRdv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rendezvous);

        buttonRdv = (Button) findViewById(R.id.buttonRdv);
        buttonRdv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RendezVous.this, MainActivity.class);
                Toast.makeText(RendezVous.this, "Votre inscription a bien été prise en compte!", Toast.LENGTH_LONG).show();
                startActivity(intent);


            }

        });

    }

}




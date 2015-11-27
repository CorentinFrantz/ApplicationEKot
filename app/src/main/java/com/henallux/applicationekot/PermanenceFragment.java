package com.henallux.applicationekot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



/**
 * Created by Corentin on 01/11/2015.
 */


public class PermanenceFragment extends Fragment {

    private TextView textPerma;
    private TextView textHeurePerma;
    private TextView adresseKot;
    private Button goToRendezVous;
    private View goToAdmin;


    public static PermanenceFragment newInstance()
    {
        PermanenceFragment fragment = new PermanenceFragment();
        return fragment;
    }

    public PermanenceFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.permanence_fragment, container, false);

        goToAdmin = rootView.findViewById((R.id.imagePerma));
        goToAdmin.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(getActivity(), RendezVous.class);
                startActivity(intent);
                return true;
            }
        });

        textPerma = (TextView) rootView.findViewById(R.id.textPermanence);
        textHeurePerma = (TextView) rootView.findViewById(R.id.textHeurePerma);

        goToRendezVous = (Button)rootView.findViewById(R.id.buttonRendezVous);
        goToRendezVous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), RendezVous.class);
                startActivity(intent);

            }
        });
        return rootView;
    }
}


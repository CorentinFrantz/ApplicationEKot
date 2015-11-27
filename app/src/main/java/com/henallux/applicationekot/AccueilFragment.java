package com.henallux.applicationekot;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

/**
 * Created by Corentin on 01/11/2015.
 */
public class AccueilFragment extends Fragment {

    public static AccueilFragment newInstance()
    {
        AccueilFragment fragment = new AccueilFragment();
        return fragment;
    }


    public AccueilFragment() {
    }


TextView titreAccueil;
TextView descriptionAccueilFAQ;
TextView descriptionAccueilPerma;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.accueil_fragment, container, false);
        titreAccueil = (TextView) rootView.findViewById(R.id.titreAccueil);
        descriptionAccueilFAQ = (TextView) rootView.findViewById(R.id.descriptionAccueilFAQ);
        descriptionAccueilPerma = (TextView) rootView.findViewById(R.id.descriptionAccueilPerma);
        return rootView;
    }
}

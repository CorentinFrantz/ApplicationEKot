package com.henallux.applicationekot;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

import org.w3c.dom.Text;

/**
 * Created by Corentin on 01/11/2015.
 */
public class ContactFragment extends Fragment {

    public static ContactFragment newInstance()
    {
        ContactFragment fragment = new ContactFragment();
        return fragment;
    }


    public ContactFragment() {
    }


    TextView titreContact;
    TextView titreKot;
    TextView adresseKot;
    TextView titreCercle;
    TextView adresseCercle;
    TextView contactEmailTel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.contact_fragment, container, false);
        titreContact = (TextView) rootView.findViewById(R.id.textTitreContact);
        titreKot = (TextView) rootView.findViewById(R.id.titreKot);
        adresseKot = (TextView) rootView.findViewById(R.id.adresseKot);
        titreCercle = (TextView) rootView.findViewById(R.id.titreCercle);
        adresseCercle = (TextView) rootView.findViewById(R.id.adresseCercle);
        contactEmailTel = (TextView) rootView.findViewById(R.id.contactEmailTel);
        return rootView;
    }
}

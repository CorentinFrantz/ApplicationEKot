package com.henallux.applicationekot;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.Fragment;

import org.w3c.dom.Text;

/**
 * Created by Corentin on 01/11/2015.
 */
public class ContactFragment extends Fragment {


    private TextView titreContact;
    private TextView titreKot;
    private TextView adresseKot;
    private TextView titreCercle;
    private TextView adresseCercle;
    private TextView contactEmailTel;
    private ImageView imageAppel;
    private ImageView imageEmail;

    public static ContactFragment newInstance()
    {
        ContactFragment fragment = new ContactFragment();
        return fragment;
    }


    public ContactFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contact_fragment, container, false);
        titreContact = (TextView) rootView.findViewById(R.id.textTitreContact);
        titreKot = (TextView) rootView.findViewById(R.id.titreKot);
        adresseKot = (TextView) rootView.findViewById(R.id.adresseKot);
        titreCercle = (TextView) rootView.findViewById(R.id.titreCercle);
        adresseCercle = (TextView) rootView.findViewById(R.id.adresseCercle);
        contactEmailTel = (TextView) rootView.findViewById(R.id.contactEmailTel);

        imageAppel = (ImageView) rootView.findViewById(R.id.androidCall);
        imageAppel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.net.Uri uri = Uri.parse("tel:0495768304");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);

            }
        });

        imageEmail = (ImageView) rootView.findViewById(R.id.imageButtonMail);
        imageEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of email");
                intent.setData(Uri.parse("mailto:contact@ekot.be"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //
                startActivity(intent);
            }
        });

        return rootView;
    }

}


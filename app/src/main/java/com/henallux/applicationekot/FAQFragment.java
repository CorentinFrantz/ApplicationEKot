package com.henallux.applicationekot;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Corentin on 01/11/2015.
 */
public class FAQFragment extends Fragment {

    private ListView FaqList;
    private TextView titreFAQ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.faq_fragment, container, false);

        titreFAQ = (TextView) rootView.findViewById(R.id.titreFAQ);

        FaqList = (ListView) rootView.findViewById(R.id.listView);

        //ArrayList<String> allQuestions =
        String[] values = new String[] { "Comment ajouter une machine sur le réseau?",
                "Comment retirer une machine du réseau?",
                "Comment vérifier son quota?",
                "Comment utiliser le Wifi à partir d'un PC?",
                "Quel est la limite du quota?",
                "Est-ce normal que le réseau est de plus en plus lent?",
                "Puis-je utiliser un routeur?",
                "Où puis-je trouver un routeur?",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST",
                "TEST"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(rootView.getContext(),android.R.layout.simple_list_item_1, values);

        FaqList.setAdapter(adapter);



        FaqList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) FaqList.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getContext(),"Redirection vers un site externe...", Toast.LENGTH_LONG).show();
                if (position  ==0) {
                    Uri uri = Uri.parse("http://google.com/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }


            }

    });

        return rootView;
}

    public static FAQFragment newInstance()
    {
        FAQFragment fragment = new FAQFragment();
        return fragment;
    }

    public FAQFragment() {
    }
}





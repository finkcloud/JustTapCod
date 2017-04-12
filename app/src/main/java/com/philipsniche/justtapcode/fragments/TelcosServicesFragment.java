package com.philipsniche.justtapcode.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.philipsniche.justtapcode.NetworksActivity;
import com.philipsniche.justtapcode.R;
import com.philipsniche.justtapcode.model.TelcolsAgent;
import com.philipsniche.justtapcode.utils.TelecomAdapter;

import java.util.ArrayList;

/**
 * Created by FILIT TECHNOLOGIES on 4/6/2017.
 */

public class TelcosServicesFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.bank_list, container, false);


        final ArrayList<TelcolsAgent> telcos = new ArrayList<>();
        telcos.add(new TelcolsAgent("MTN Nigeria", R.mipmap.ic_launcher));
        telcos.add(new TelcolsAgent("Globacom Nigeria", R.mipmap.ic_launcher));
        telcos.add(new TelcolsAgent("Airtel Nigeria", R.mipmap.ic_launcher));
        telcos.add(new TelcolsAgent("Etisalat Nigeria", R.mipmap.ic_launcher));
        telcos.add(new TelcolsAgent("VisaPhone", R.mipmap.ic_launcher));


        TelecomAdapter adapter = new TelecomAdapter(getActivity(), telcos);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TelcolsAgent telAgent = telcos.get(position);
                pushToast(telAgent.getmName());
                startActivity(new Intent(getActivity(), NetworksActivity.class));

            }
        });


        return rootview;
    }

    private void pushToast(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}

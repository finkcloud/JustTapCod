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

import com.philipsniche.justtapcode.BanksActivity;
import com.philipsniche.justtapcode.R;
import com.philipsniche.justtapcode.utils.BankAdapter;
import com.philipsniche.justtapcode.model.BankAgent;

import java.util.ArrayList;

/**
 * Created by FILIT TECHNOLOGIES on 4/6/2017.
 */

public class BankServicesFragment extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.bank_list, container, false);

        final ArrayList<BankAgent> banks = new ArrayList<>();
        banks.add(new BankAgent("Gaurantee Trust Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("First Bank Nig.",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Firs City Monument FCMB",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Diamond Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Gaurantee Trust Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Heritage Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Access Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Fidelity Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Sterling Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Wema Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Eco Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("UBA Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Zenith Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Keystone Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Union Bank",R.mipmap.ic_launcher));
        banks.add(new BankAgent("Stabic IBTC Bank",R.mipmap.ic_launcher));



        BankAdapter adapter = new BankAdapter(getActivity(), banks);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BankAgent bankAgent = banks.get(position);
                pushToast(bankAgent.getmName());
                startActivity(new Intent(getActivity(), BanksActivity.class));
            }
        });

        return rootview;
    }

    private void pushToast(String message)
    {
        Toast.makeText(getActivity(),message,Toast.LENGTH_SHORT).show();
    }
}

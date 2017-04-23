package com.philipsniche.justtapcode.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.philipsniche.justtapcode.R;
import com.philipsniche.justtapcode.model.TelcServicesCode;

import java.util.ArrayList;

/**
 * Created by FILIT TECHNOLOGIES on 4/7/2017.
 */

public class MTNFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.bank_list, container, false);

        final ArrayList<TelcServicesCode> telcosservice = new ArrayList<>();
        //remove some dummy model data
        





        return rootview;

    }
}

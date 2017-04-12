package com.philipsniche.justtapcode.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.philipsniche.justtapcode.R;

/**
 * Created by FILIT TECHNOLOGIES on 4/9/2017.
 */

public class GLOFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.bank_list, container, false);

        return rootview;
    }
}


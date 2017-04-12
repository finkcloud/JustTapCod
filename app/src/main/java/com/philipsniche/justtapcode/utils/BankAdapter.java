package com.philipsniche.justtapcode.utils;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.philipsniche.justtapcode.R;
import com.philipsniche.justtapcode.model.BankAgent;

import java.util.ArrayList;

/**
 * Created by FILIT TECHNOLOGIES on 4/6/2017.
 */

public class BankAdapter extends ArrayAdapter<BankAgent> {

    public BankAdapter(Context context, ArrayList<BankAgent> bankServices) {
        super(context, 0, bankServices);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        BankAgent currentBank = getItem(position);


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Find the TextView in the quake_list_item.xml layout with the ID textViewMagnitude
        ImageView bankIcon = (ImageView) listItemView.findViewById(R.id.img_bank_icon);

        // set this text on the name TextView
        bankIcon.setImageResource(currentBank.getmIconResourceId());

        // Find the TextView in the quake_list_item.xml layout with the ID textViewMagnitude
        TextView normalName = (TextView) listItemView.findViewById(R.id.txtBankFullName);

        // set this text on the name TextView
        normalName.setText(currentBank.getmName());

        return listItemView;
    }

    private int getbankColor(String bank) {
        int magnitudeColor;
        switch (bank) {
            case "GTB":
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.mtn_color);
                break;
            case "GLO":
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.glo_color);
                break;
            case "ETISALAT":
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.etisalat_color);
                break;
            case "AIRTEL":
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.airtel_color);
                break;
            default:
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.magnitude10plus);
                break;
        }
        return magnitudeColor;
    }

    private int getTelcosColor(String bank) {
        int magnitudeColor;
        switch (bank) {
            case "MTN":
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.mtn_color);
                break;
            case "GLO":
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.glo_color);
                break;
            case "ETISALAT":
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.etisalat_color);
                break;
            case "AIRTEL":
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.airtel_color);
                break;
            default:
                magnitudeColor = ContextCompat.getColor(getContext(), R.color.magnitude10plus);
                break;
        }
        return magnitudeColor;
    }
}

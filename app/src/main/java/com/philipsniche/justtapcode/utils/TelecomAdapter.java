package com.philipsniche.justtapcode.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.philipsniche.justtapcode.R;
import com.philipsniche.justtapcode.model.TelcolsAgent;

import java.util.ArrayList;

/**
 * Created by FILIT TECHNOLOGIES on 4/6/2017.
 */

public class TelecomAdapter extends ArrayAdapter<TelcolsAgent> {


    public TelecomAdapter(Context context, ArrayList<TelcolsAgent> telcAgent) {
        super(context, 0, telcAgent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TelcolsAgent currentTelcos = getItem(position);


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the TextView in the quake_list_item.xml layout with the ID textViewMagnitude
        ImageView TelecomIcon = (ImageView) listItemView.findViewById(R.id.img_bank_icon);

        // set this text on the name TextView
        TelecomIcon.setImageResource(currentTelcos.getmIconResourceId());

        // Find the TextView in the quake_list_item.xml layout with the ID textViewMagnitude
        TextView normalName = (TextView) listItemView.findViewById(R.id.txtBankFullName);

        // set this text on the name TextView
        normalName.setText(currentTelcos.getmName());

        return listItemView;
    }
}

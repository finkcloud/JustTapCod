package com.philipsniche.justtapcode.utils;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.philipsniche.justtapcode.model.TelcServicesCode;

/**
 * Created by FILIT TECHNOLOGIES on 4/7/2017.
 */

public class MtnAdapter extends ArrayAdapter<TelcServicesCode> {

    public MtnAdapter(Context context, int resource) {
        super(context, resource);
    }
}

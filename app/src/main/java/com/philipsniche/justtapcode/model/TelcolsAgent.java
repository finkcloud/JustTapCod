package com.philipsniche.justtapcode.model;

/**
 * Created by FILIT TECHNOLOGIES on 4/6/2017.
 */

public class TelcolsAgent {
    protected String mName;
    protected int mIconResourceId;

    public TelcolsAgent(String name, int iconId) {
        this.mName = name;
        this.mIconResourceId = iconId;
    }

    public int getmIconResourceId() {
        return mIconResourceId;
    }

    public String getmName() {
        return mName;
    }


}

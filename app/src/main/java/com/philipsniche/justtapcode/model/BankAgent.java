package com.philipsniche.justtapcode.model;

/**
 * Created by FILIT TECHNOLOGIES on 4/6/2017.
 */

public class BankAgent {
    protected String shortName;
    protected String mName;
    protected int mIconResourceId;

    public BankAgent(String name, int iconId) {
        this.mName = name;
        this.mIconResourceId = iconId;
    }

    public BankAgent(String shortnm, String name) {
        this.shortName = shortnm;
        this.mName = name;
    }

    public int getmIconResourceId() {
        return mIconResourceId;
    }

    public String getmName() {
        return mName;
    }

    public String getShortName() {
        return shortName;
    }


}

package com.philipsniche.justtapcode.model;

/**
 * Created by FILIT TECHNOLOGIES on 4/6/2017.
 */

public class TelcServicesCode extends TelcolsAgent {

    private String serviceCode;
    private String price;
    private float size;

    public TelcServicesCode(String name, String code,String price, float size) {
        super(name,0);
        this.serviceCode = code;
        this.price = price;
        this.size = size;

    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TelcServicesCode{" +
                "serviceCode='" + serviceCode + '\'' +
                ", price='" + price + '\'' +
                ", size=" + size +
                '}';
    }
}

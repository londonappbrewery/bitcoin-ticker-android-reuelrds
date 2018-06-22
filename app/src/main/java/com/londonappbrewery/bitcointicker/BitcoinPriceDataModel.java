package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinPriceDataModel {

    private String mPrice;

    public static BitcoinPriceDataModel fromJson(JSONObject object){

        BitcoinPriceDataModel bitcoin = new BitcoinPriceDataModel();
        try {
            bitcoin.mPrice = String.valueOf(object.getJSONObject("averages").getDouble("day"));
            return bitcoin;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getPrice() {
        return mPrice;
    }
}

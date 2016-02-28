package com.li.xroads.asynctask;

import android.location.Location;
import android.os.AsyncTask;

import com.li.xroads.helper.RestClient;
import com.li.xroads.util.Constant;
import com.li.xroads.util.PropertiesReader;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sony on 28-02-2016.
 */
public class SendLocation extends AsyncTask<String, Void, String> {


    @Override
    protected String doInBackground(String... params) {
        JSONObject locJson = new JSONObject();
        try {
            locJson.put(Constant.TRIP_ID, params[0]);
            locJson.put(Constant.USER_ID, params[1]);
            locJson.put(Constant.Latitude, params[2]);
            locJson.put(Constant.Longitude, params[3]);


            RestClient client = new RestClient();
            client.doPost(PropertiesReader.getProperty("server_url"),locJson);
        } catch (JSONException ex) {

        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
    }

    @Override
    protected void onPreExecute() {
    }

    @Override
    protected void onProgressUpdate(Void... values) {
    }
}

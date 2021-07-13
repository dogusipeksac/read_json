package com.example.read_json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String JsonFromURL="{" +
                "'info':{'name':'hussein','age':27 }," +
                "'jobs':" +
                "[" +
                "{'id':1, 'title':'developer','desc':'nyc'}," +
                "{'id':2, 'title':'developer','desc':'nyc'}," +
                "{'id':3, 'title':'developer','desc':'nyc'}" +
                "]" +
                "}";

        try {
            JSONObject jsonObject=new JSONObject();
            JSONObject info=jsonObject.getJSONObject("info");
            String name=info.getString("name");
            int age=info. getInt("age");
            JSONArray jobs=jsonObject.getJSONArray("jobs");
            for(int i=0;i<jobs.length();i++){
                JSONObject Jobs=jobs.getJSONObject(i);
                String title=Jobs.getString("title");
                String desc=Jobs.getString("desc");
                int id=Jobs.getInt("id");

            }
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
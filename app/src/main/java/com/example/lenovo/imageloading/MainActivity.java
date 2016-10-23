package com.example.lenovo.imageloading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.item_container, new ItemFragment()).commit();

    //    img = (ImageView) findViewById(R.id.img);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
          //  fetchData(Constant.URL);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   /* private void fetchData(String url) {

        RequestQueue requestQue = Volley.newRequestQueue(getApplicationContext());
        StringRequest string = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            JSONArray results = jsonObject.optJSONArray("results");
                            //  for (int i = 0; i < results.length(); i++) {

                            JSONObject firstobject = results.optJSONObject(0);
                            String img_path = firstobject.optString("poster_path");

                            String full_img = Constant.IMG_BASE + img_path;

                            Glide.with(getApplicationContext()).load(full_img).into(img);

                            //   }

                        } catch (JSONException e) {
                            e.printStackTrace();

                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        // requestQue.add(string);
        MySingleton.getInstance(getApplicationContext()).addToRequestQueue(string);
    }*/
}

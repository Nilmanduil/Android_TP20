package fr.codevallee.formation.android_tp20;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public final String url = "http://www.json-generator.com/api/json/get/cqJwgRSHUy?indent=3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncTask downloadDataTask = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] params) {
                try {
                    String json = IOUtils.toString(new URL(MainActivity.this.url), Charset.forName("UTF-8"));
                    // Log.d("[INFO] JSON Raw Output", json);

                    Gson gson = new GsonBuilder().serializeNulls().create();

                    Type listType = new TypeToken<ArrayList<User>>(){}.getType();
                    ArrayList<User> users = gson.fromJson(json, listType);
                    ArrayList<String> usersStringArray = new ArrayList<>(users.size());
                    for (User user : users) {
                        Log.e("[INFO] JSON output User", user.toString());
                        usersStringArray.add(user.toString());
                    }

                    final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, usersStringArray);
                    final UserAdapter userAdapter = new UserAdapter(MainActivity.this, users);
                    final ListView usersList = (ListView) findViewById(R.id.list_view);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            usersList.setAdapter(userAdapter);
                        }
                    });

                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };

        downloadDataTask.execute();
    }
}

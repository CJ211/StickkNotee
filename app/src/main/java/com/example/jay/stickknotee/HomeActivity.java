package com.example.jay.stickknotee;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        // Instance of ImageAdapter Class
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                navigate(position);
            }
        });
    }

    public void navigate(int position){
        switch (position){
            case 0:
                Intent intentMemo = new Intent(this, MainActivity.class);
                Log.e("HA : ","Memo Clicked");
                startActivity(intentMemo);
                break;

            case 1:
                Intent intentToDO = new Intent(this, ToDoActivity.class);
                Log.e("HA : ","Todo Clicked");
                startActivity(intentToDO);
                break;
        }
    }
}
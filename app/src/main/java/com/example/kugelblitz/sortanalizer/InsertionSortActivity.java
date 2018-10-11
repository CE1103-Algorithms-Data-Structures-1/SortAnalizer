package com.example.kugelblitz.sortanalizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class InsertionSortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion_sort);

        final Button startSortBtn = (Button) findViewById(R.id.startSortBtn);
        startSortBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup layout =  (ViewGroup) startSortBtn.getParent();
                layout.removeView(startSortBtn);
            }
        });
    }
}

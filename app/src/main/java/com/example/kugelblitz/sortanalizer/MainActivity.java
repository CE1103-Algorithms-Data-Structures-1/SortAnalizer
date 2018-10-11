package com.example.kugelblitz.sortanalizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button InsertionSortBtn = (Button) findViewById(R.id.InsertionSortBtn);
        InsertionSortBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertionSortIntent = new Intent(getApplicationContext(), InsertionSortActivity.class);
                startActivity(insertionSortIntent);
            }
        });

        Button SelectionSortBtn = (Button) findViewById(R.id.SelectionSortBtn);
        SelectionSortBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectionSortIntent = new Intent(getApplicationContext(), SelectionSortActivity.class);
                startActivity(selectionSortIntent);
            }
        });
    }
}

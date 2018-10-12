package com.example.kugelblitz.sortanalizer;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SelectionSortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_sort);

        final Button startSortBtn = (Button) findViewById(R.id.startSortBtn);
        startSortBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup layout =  (ViewGroup) startSortBtn.getParent();
                layout.removeView(startSortBtn);
                showSort();
            }
        });
    }

    public void showSort() {
        ConstraintLayout rl = (ConstraintLayout) findViewById(R.id.rl);
        TextView initialArrayText = new TextView(getApplicationContext());
        initialArrayText.setText("Para array: {8,56,32,90,132,506,2001,21,222,57}");
        initialArrayText.setTextSize(18);
        initialArrayText.setTextColor(Color.parseColor("#33b5e5"));
        ViewGroup.LayoutParams lp = new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        initialArrayText.setLayoutParams(lp);
        rl.addView(initialArrayText);

        // Sort is executed here
        int[] array = {8,56,32,90,132,506,2001,21,222,57};
        int numOfAccess = 0;
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i+1; j <array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            numOfAccess += 3;
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            TextView stepText = new TextView(getApplicationContext());
            stepText.setText("Paso " + (i+1) + ":   ");
            
            for (int k=0; k < array.length; k++) {
                System.out.print(array[k] + "   ");
            }
            System.out.println("");
        }
        System.out.println("Number of swaps : " +numOfAccess);
    }

    public void testText() {
        // Get the widgets reference from XML layout
        ConstraintLayout rl = (ConstraintLayout) findViewById(R.id.rl);

        // Create a TextView programmatically.
        TextView tv = new TextView(getApplicationContext());

        // Create a LayoutParams for TextView
        ViewGroup.LayoutParams lp = new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, // Width of TextView
                ViewGroup.LayoutParams.WRAP_CONTENT); // Height of TextView

        // Apply the layout parameters to TextView widget
        tv.setLayoutParams(lp);

        // Set text to display in TextView
        tv.setText("This is a sample TextView...");

        // Set a text color for TextView text
        tv.setTextColor(Color.parseColor("#ff0000"));

        // Add newly created TextView to parent view group (RelativeLayout)
        rl.addView(tv);
    }
}

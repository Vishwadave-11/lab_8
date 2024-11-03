package com.example.cst2335lab8;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.TextView;

public class DadJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad_joke);

        // Set up Toolbar
        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Dad Joke");
        setSupportActionBar(toolbar);

        // Enable the up button for navigation
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Set the joke text
        TextView jokeTextView = findViewById(R.id.jokeTextView);
        jokeTextView.setText("Why don't skeletons fight each other? They don't have the guts!");
    }
}

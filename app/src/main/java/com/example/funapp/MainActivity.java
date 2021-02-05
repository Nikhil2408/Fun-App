package com.example.funapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void feedCookie(View view)
    {
        ImageView imageView = (ImageView) findViewById(R.id.before_cookie_image);
        imageView.setImageResource(R.drawable.after_cookie);

        TextView textView=(TextView) findViewById(R.id.before_cookie_text);
        textView.setText("Thanks for feeding me!!");
    }

}
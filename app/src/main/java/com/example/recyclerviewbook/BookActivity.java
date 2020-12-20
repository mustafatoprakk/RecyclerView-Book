package com.example.recyclerviewbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView bookTitle,bookDescription,bookCategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        bookTitle=findViewById(R.id.bookTitle);
        bookDescription=findViewById(R.id.bookDescription);
        bookCategory=findViewById(R.id.bookDescription);
        img=findViewById(R.id.bookThumbnail);

        // Receive Data
        Intent intent=getIntent();
        String title=intent.getExtras().getString("Title");
        String Description=intent.getExtras().getString("Description");
        int image=intent.getExtras().getInt("Thumbnail");

        // Setting values

        bookTitle.setText(title);
        bookDescription.setText(Description);
        img.setImageResource(image);
    }
}
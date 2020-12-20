package com.example.recyclerviewbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook=new ArrayList<>();
        lstBook.add(new Book("The Vegiterian","Category Book","Description Book",R.drawable.book1));
        lstBook.add(new Book("The Wild Robot","Category Book","Description Book",R.drawable.book2));
        lstBook.add(new Book("Maria Semples","Category Book","Description Book",R.drawable.book3));
        lstBook.add(new Book("Angelina Aludo","Category Book","Description Book",R.drawable.book4));
        lstBook.add(new Book("Richard Bullivant","Category Book","Description Book",R.drawable.book5));
        lstBook.add(new Book("Jack Arbor","Category Book","Description Book",R.drawable.book6));
        lstBook.add(new Book("The Fruit","Category Book","Description Book",R.drawable.book7));
        lstBook.add(new Book("The Apple","Category Book","Description Book",R.drawable.book8));
        lstBook.add(new Book("The Banana","Category Book","Description Book",R.drawable.book9));
        lstBook.add(new Book("The Dish","Category Book","Description Book",R.drawable.book10));
        lstBook.add(new Book("The Water","Category Book","Description Book",R.drawable.book11));

        RecyclerView recyclerViewBook=findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,lstBook);
        recyclerViewBook.setLayoutManager(new GridLayoutManager(this,3));
        recyclerViewBook.setAdapter(adapter);

    }
}
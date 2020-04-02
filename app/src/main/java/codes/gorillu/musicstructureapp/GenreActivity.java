package codes.gorillu.musicstructureapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GenreActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the custom layout by id: genre_list
        setContentView(R.layout.genre_list);

        // Create a ArrayList<Genre>
        final ArrayList<Genre> genres = new ArrayList<>();
        // Adding genre's data
        genres.add(new Genre("Rock", R.drawable.rock));
        genres.add(new Genre("Metal", R.drawable.metal));
        genres.add(new Genre("Indie", R.drawable.indie));
        genres.add(new Genre("Blues", R.drawable.blues));
        genres.add(new Genre("Jazz", R.drawable.jazz));
        genres.add(new Genre("Folk", R.drawable.folk));
        genres.add(new Genre("Hip Hop", R.drawable.hip_hop));
        genres.add(new Genre("Soul", R.drawable.soul));


        // Create a GenreAdapter
        GenreAdapter adapter = new GenreAdapter(this, genres);

        // Get the ListView by id: list
        final ListView listView = (ListView) findViewById(R.id.list);

        // Set the adapter to listView
        listView.setAdapter(adapter);

                /*
            Create a ClickListener and set a explicit intent with Extra vars
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Get the current genre
                Genre genre = genres.get(i);

                // Create new Intent
                Intent collectionIntent = new Intent(GenreActivity.this, CollectionActivity.class);

                // Start intent activity
                startActivity(collectionIntent);
            }
        });


    }
}

package codes.gorillu.musicstructureapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GenreActivity extends AppCompatActivity {


    @BindView(R.id.list)
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the custom layout by id: genre_list
        setContentView(R.layout.genre_list);
        ButterKnife.bind(this);

        // Create a ArrayList<Genre>
        final ArrayList<Genre> genres = new ArrayList<>();
        // Adding genre's data
        genres.add(new Genre("Rock", R.drawable.rock, R.drawable.rock));
        genres.add(new Genre("Metal", R.drawable.metal, R.drawable.metal));
        genres.add(new Genre("Indie", R.drawable.indie, R.drawable.indie));
        genres.add(new Genre("Blues", R.drawable.blues, R.drawable.blues));
        genres.add(new Genre("Jazz", R.drawable.jazz, R.drawable.jazz));
        genres.add(new Genre("Folk", R.drawable.folk, R.drawable.folk));
        genres.add(new Genre("Hip Hop", R.drawable.hip_hop, R.drawable.hip_hop));
        genres.add(new Genre("Soul", R.drawable.soul, R.drawable.soul));


        // Create a GenreAdapter
        GenreAdapter adapter = new GenreAdapter(this, genres);

        // Get the ListView by id: list
        final ListView listView = findViewById(R.id.list);

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

                // Adding Extra info: COLLECTION_TITLE for the genre title,
                // COLLECTION_COVER_IMG_ID for the cover image resource ID
                collectionIntent.putExtra("COLLECTION_TITLE", genre.getGenreName());
                collectionIntent.putExtra("COLLECTION_COVER_IMG_ID", genre.getCoverImageId());


                // Start intent activity
                startActivity(collectionIntent);
            }

        });

    }
}

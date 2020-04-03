package codes.gorillu.musicstructureapp;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CollectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);


        // Retrieving Intent Extras


        // Retrieving collection title from Intent Extras: COLLECTION_TITLE
        String collection_title = getIntent().getStringExtra("COLLECTION_TITLE");

        // Set the current Activity title as COLLECTION_TITLE
        setTitle("Collection: " + collection_title);

        // Retrieving cover image's resource id from Intent Extras: COLLECTION_COVER_IMG_ID
        int collection_image_resource_id = getIntent().getIntExtra("COLLECTION_COVER_IMG_ID", -1);

        /*
           Set the cover images to the resource ID
         */
        // First, find the corresponding layout id
        ImageView collection_cover_image = findViewById(R.id.colct_cover_image);

        // Set the resource ID
        collection_cover_image.setImageResource(collection_image_resource_id);

        // Make the image darker by filtering with PorterDuff function with MULTIPLY mode
        collection_cover_image.setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY);

        // Set the text on top of cover image
        TextView colct_textview = findViewById(R.id.colct_cover_title);
        colct_textview.setText(collection_title);

        // Init corresponding song's ArrayList data by collection_title


        if (collection_title.equals("Rock")) {
            rockSongsInit();
        } else if (collection_title.equals("Metal")) {
            metalSongsInit();
        } else if (collection_title.equals("Indie")) {
            indieSongsInit();
        } else if (collection_title.equals("Blues")) {
            bluesSongsInit();
        } else if (collection_title.equals("Jazz")) {
            jazzSongsInit();
        } else if (collection_title.equals("Folk")) {
            folkSongsInit();
        } else if (collection_title.equals("Hip Hop")) {
            hiphopSongsInit();
        } else if (collection_title.equals("Soul")) {
            soulSongsInit();
        }
    }




    //  Function to init songs in [Rock] category

    private void rockSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Rock song title",
                "Rock Artist",
                "Rock Album",
                "3:19"));
        songs.add(new Song("Rock song title",
                "Rock Artist",
                "Rock Album",
                "4:58"));
        songs.add(new Song("Rock song title",
                "Rock Artist",
                "Rock Album",
                "2:39"));
        songs.add(new Song("Rock song title",
                "Rock Artist",
                "Rock Album",
                "3:19"));
        songs.add(new Song("Rock song title",
                "Rock Artist",
                "Rock Album",
                "4:20"));
        songs.add(new Song("Rock song title",
                "Rock Artist",
                "Rock Album",
                "3:38"));
        songs.add(new Song("Rock song title",
                "Rock Artist",
                "Rock Album",
                "3:34"));
        songs.add(new Song("Rock song title",
                "Rock Artist",
                "Rock Album",
                "5:30"));
        songs.add(new Song("Rock song title",
                "Rock Artist",
                "Rock Album",
                "3:04"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }



    // Function to init songs in [Metal] category

    private void metalSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Metal song title",
                "Metal Artist",
                "Metal Album",
                "3:19"));
        songs.add(new Song("Metal song title",
                "Metal Artist",
                "Metal Album",
                "4:58"));
        songs.add(new Song("Metal song title",
                "Metal Artist",
                "Metal Album",
                "2:39"));
        songs.add(new Song("Metal song title",
                "Metal Artist",
                "Metal Album",
                "3:19"));
        songs.add(new Song("Metal song title",
                "Metal Artist",
                "Metal Album",
                "4:20"));
        songs.add(new Song("Metal song title",
                "Metal Artist",
                "Metal Album",
                "3:38"));
        songs.add(new Song("Metal song title",
                "Metal Artist",
                "Metal Album",
                "3:34"));
        songs.add(new Song("Metal song title",
                "Metal Artist",
                "Metal Album",
                "5:30"));
        songs.add(new Song("Metal song title",
                "Metal Artist",
                "Metal Album",
                "3:04"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }


    //  Function to init songs in [indie] category

    private void indieSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Indie song title",
                "Indie Artist",
                "Indie Album",
                "3:19"));
        songs.add(new Song("Indie song title",
                "Indie Artist",
                "Indie Album",
                "4:58"));
        songs.add(new Song("Indie song title",
                "Indie Artist",
                "Indie Album",
                "2:39"));
        songs.add(new Song("Indie song title",
                "Indie Artist",
                "Indie Album",
                "3:19"));
        songs.add(new Song("Indie song title",
                "Indie Artist",
                "Indie Album",
                ""));
        songs.add(new Song("Indie song title",
                "Indie Artist",
                "Indie Album",
                "3:38"));
        songs.add(new Song("Indie song title",
                "Indie Artist",
                "Indie Album",
                "3:34"));
        songs.add(new Song("Indie song title",
                "Indie Artist",
                "Indie Album",
                "5:30"));
        songs.add(new Song("Indie song title",
                "Indie Artist",
                "Indie Album",
                "3:04"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }


    //  Function to init songs in [Blues] category

    private void bluesSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Blues song title",
                "Blues Artist",
                "Blues Album",
                "3:19"));
        songs.add(new Song("Blues song title",
                "Blues Artist",
                "Blues Album",
                "4:58"));
        songs.add(new Song("Blues song title",
                "Blues Artist",
                "Blues Album",
                "2:39"));
        songs.add(new Song("Blues song title",
                "Blues Artist",
                "Blues Album",
                "3:19"));
        songs.add(new Song("Blues song title",
                "Blues Artist",
                "Blues Album",
                "4:20"));
        songs.add(new Song("Blues song title",
                "Blues Artist",
                "Blues Album",
                "3:38"));
        songs.add(new Song("Blues song title",
                "Blues Artist",
                "Blues Album",
                "3:34"));
        songs.add(new Song("Blues song title",
                "Blues Artist",
                "Blues Album",
                "5:30"));
        songs.add(new Song("Blues song title",
                "Blues Artist",
                "Blues Album",
                "3:04"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }

    //  Function to init songs in [Jazz] category

    private void jazzSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Jazz song title",
                "Jazz Artist",
                "Jazz Album",
                "3:19"));
        songs.add(new Song("Jazz song title",
                "Jazz Artist",
                "Jazz Album",
                "4:58"));
        songs.add(new Song("Jazz song title",
                "Jazz Artist",
                "Jazz Album",
                "2:39"));
        songs.add(new Song("Jazz song title",
                "Jazz Artist",
                "Jazz Album",
                "3:19"));
        songs.add(new Song("Jazz song title",
                "Jazz Artist",
                "Jazz Album",
                "4:20"));
        songs.add(new Song("Jazz song title",
                "Jazz Artist",
                "Jazz Album",
                "3:38"));
        songs.add(new Song("Jazz song title",
                "Jazz Artist",
                "Jazz Album",
                "3:34"));
        songs.add(new Song("Jazz song title",
                "Jazz Artist",
                "Jazz Album",
                "5:30"));
        songs.add(new Song("Jazz song title",
                "Jazz Artist",
                "Jazz Album",
                "3:04"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }

    //  Function to init songs in [Folk] category

    private void folkSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Folk song title",
                "Folk Artist",
                "Folk Album",
                "3:19"));
        songs.add(new Song("Folk song title",
                "Folk Artist",
                "Folk Album",
                "4:58"));
        songs.add(new Song("Folk song title",
                "Folk Artist",
                "Folk Album",
                "2:39"));
        songs.add(new Song("Folk song title",
                "Folk Artist",
                "Folk Album",
                "3:19"));
        songs.add(new Song("Folk song title",
                "Folk Artist",
                "Folk Album",
                "4:20"));
        songs.add(new Song("Folk song title",
                "Folk Artist",
                "Folk Album",
                "3:38"));
        songs.add(new Song("Folk song title",
                "Folk Artist",
                "Folk Album",
                "3:38"));
        songs.add(new Song("Folk song title",
                "Folk Artist",
                "Folk Album",
                "5:30"));
        songs.add(new Song("Folk song title",
                "Folk Artist",
                "Folk Album",
                "3:04"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }

    //  Function to init songs in [Hip Hop] category

    private void hiphopSongsInit() {
        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "3:19"));
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "4:58"));
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "2:39"));
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "3:19"));
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "4:20"));
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "3:38"));
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "3:38"));
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "5:30"));
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "3:04"));

        // Attach songs data to the Adapter
        attachAdapter(songs);
    }

    //  Function to init songs in [Soul] category

    private void soulSongsInit() {

        // Init ArrayList<Song>
        final ArrayList<Song> songs = new ArrayList<Song>();

        // Adding songs data
        songs.add(new Song("Soul song title",
                "Soul Artist",
                "Soul Album",
                "3:19"));
        songs.add(new Song("Soul song title",
                "Soul Artist",
                "Soul Album",
                "4:58"));
        songs.add(new Song("Soul song title",
                "Soul Artist",
                "Soul Album",
                "2:39"));
        songs.add(new Song("Soul song title",
                "Soul Artist",
                "Soul Album",
                "3:19"));
        songs.add(new Song("Soul song title",
                "Soul Artist",
                "Soul Album",
                "4:20"));
        songs.add(new Song("Soul song title",
                "Soul Artist",
                "Soul Album",
                "3:38"));
        songs.add(new Song("Soul song title",
                "Soul Artist",
                "Soul Album",
                "3:38"));
        songs.add(new Song("Soul song title",
                "Soul Artist",
                "Soul Album",
                "5:30"));
        songs.add(new Song("Hip Hop song title",
                "Hip Hop Artist",
                "Hip Hop Album",
                "3:04"));

        // Attach songs data to the Adapter
        attachAdapter(songs);

    }


    private void attachAdapter(final ArrayList<Song> songs) {
        // Create new adapter
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the view id by song_list
        ListView listView = (ListView) findViewById(R.id.song_list);

        // Attach adapter to the view
        listView.setAdapter(adapter);

        /*
            Create ClickListener when click on each song, then display a toast message
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Get the current song
                Song song = songs.get(i);

                // Make a toast, but not showing yet
                Toast toast = Toast.makeText(CollectionActivity.this,
                        "Now playing: " + song.getSongTitle(),
                        Toast.LENGTH_SHORT);

                // Create a toast's view so we can change its properties
                View toastView = toast.getView();

                // Change the background to white color and using PorterDuff with SRC_IN mode
                toastView.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);

                // Get a toast's text view
                TextView textView = (TextView) toastView.findViewById(android.R.id.message);

                // Change its shadow layer to transparent
                textView.setShadowLayer(0, 0, 0, Color.TRANSPARENT);

                // Set the text to dark-gray color
                textView.setTextColor(Color.DKGRAY);

                // Now, display the toast message
                toast.show();
            }
        });
    }
}

   

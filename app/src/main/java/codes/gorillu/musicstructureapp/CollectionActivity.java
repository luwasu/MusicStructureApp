package codes.gorillu.musicstructureapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CollectionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the custom layout by id: genre_list
        setContentView(R.layout.activity_collection);
    }
}

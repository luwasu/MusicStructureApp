package codes.gorillu.musicstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    // Create SongAdapter constructor
    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    /*
        Override getView method
    */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Create a view
        View listItemView = convertView;

        // If view is null, inflate it by id: list_song
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_song, parent, false);
        }

        // Get the current song with position id
        Song currentSong = getItem(position);

        // Set the song title to the view
        TextView songTitle = listItemView.findViewById(R.id.song_title);
        songTitle.setText(currentSong.getSongTitle());

        // Set the album name to the view
        TextView songAlbum = listItemView.findViewById(R.id.song_album);
        songAlbum.setText(currentSong.getSongAlbum());

        // Set the artist to the view
        TextView songArtist = listItemView.findViewById(R.id.song_artist);
        songArtist.setText(currentSong.getSongArtist());

        // Set the duration to the view
        TextView songDuration = listItemView.findViewById(R.id.song_duration);
        songDuration.setText(currentSong.getSongDuration());

        // Return the view
        return listItemView;
    }
}



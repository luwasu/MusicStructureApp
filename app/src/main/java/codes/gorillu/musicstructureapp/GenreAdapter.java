package codes.gorillu.musicstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GenreAdapter extends ArrayAdapter<Genre> {


    // Create GenreAdapter constructor
    public GenreAdapter(@NonNull Context context, ArrayList<Genre> genres) {
        super(context, 0, genres);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Create a view
        View listItemView = convertView;

        // If the view is null, inflate it by id: list_item
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the current genre by the position id
        Genre currentGenre = getItem(position);

        // Set the name to the view
        TextView genreName = listItemView.findViewById(R.id.genre_name);
        genreName.setText(currentGenre.getGenreName());

        // Set the image resource ID to the view
        ImageView albumImage = listItemView.findViewById(R.id.genre_image);
        albumImage.setImageResource(currentGenre.getGenreImageId());

        // return the view
        return listItemView;
    }

}
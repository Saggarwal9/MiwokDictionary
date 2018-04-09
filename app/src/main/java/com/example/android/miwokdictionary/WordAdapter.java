package com.example.android.miwokdictionary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwokdictionary.R;
import com.example.android.miwokdictionary.Word;

import java.util.List;

/**
 * Created by aggsh on 1/3/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, List<Word> objects, int color) {
        super(context, 0, objects);
        this.mColorResourceId = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView; //The recycled view item to populate

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        TextView textview = (TextView) listItemView.findViewById(R.id.miwok);
        textview.setText(currentWord.getmMiwokTranslation());

        TextView textview2 = (TextView) listItemView.findViewById(R.id.english);
        textview2.setText(currentWord.getmDefaultTranslation());

        ImageView imageview = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageview.setImageResource(currentWord.getSrc());
        } else {
            imageview.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}

package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> translations,int colorResourceId) {
        super(context, 0, translations);
        mColorResourceId = colorResourceId;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    View listItemView = convertView;

        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);


       Word currentWord = getItem(position);


    TextView EngTextView = (TextView) listItemView.findViewById(R.id.Eng);
    EngTextView.setText(currentWord.getEng());

    TextView FinTextView = (TextView) listItemView.findViewById(R.id.Fin);
    FinTextView.setText(currentWord.getFin());

    ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
    if (currentWord.hasImage()) {


        imageView.setImageResource(currentWord.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);

    } else {
        imageView.setVisibility(View.GONE);
    }

    View textContainer = listItemView.findViewById(R.id.text_container);
    int color = ContextCompat.getColor(getContext(), mColorResourceId);
    textContainer.setBackgroundColor(color);

    return listItemView;
}



}


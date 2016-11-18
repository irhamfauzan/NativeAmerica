package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Irhamfauzan on 16/11/2016.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private int mcolorResource;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResource) {
        super(context,0,words);
        mcolorResource = colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitem = convertView;
        if(listitem == null) {
            listitem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        TextView miwokText = (TextView) listitem.findViewById(R.id.miwok);
        miwokText.setText(currentWord.getMiwokTranslate());

        TextView englishText = (TextView) listitem.findViewById(R.id.englis);
        englishText.setText(currentWord.getEnglishTranslate());

        ImageView imageView = (ImageView) listitem.findViewById(R.id.list_item_icon);

        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageView());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer= listitem.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mcolorResource);
        textContainer.setBackgroundColor(color);

        return listitem;

    }
}

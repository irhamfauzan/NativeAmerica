package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class number extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("One","Lutti",R.drawable.number_one, R.raw.number_one));
        words.add(new Word("Two","Otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("Three","Tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("Four","Oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("Five","Massoka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("Six","Temmoka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven","Kenekaku", R.drawable.number_seven ,R.raw.number_seven));
        words.add(new Word("Eight","Kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine","Wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten","Na'aacha", R.drawable.number_ten, R.raw.number_ten));

        // Lihat Log Number
        Log.v("number","word at index 0 = "+words.get(0));
        Log.v("number","word at index 1 = "+words.get(1));
        Log.v("number","word at index 2 = "+words.get(2));
        Log.v("number","word at index 3 = "+words.get(3));
        Log.v("number","word at index 4 = "+words.get(4));
        Log.v("number","word at index 5 = "+words.get(5));
        Log.v("number","word at index 6 = "+words.get(6));
        Log.v("number","word at index 7 = "+words.get(7));
        Log.v("number","word at index 8 = "+words.get(8));
        Log.v("number","word at index 9 = "+words.get(9));

        //
        //LinearLayout Number_View = (LinearLayout) findViewById(R.id.Number_view);

        /*for (int index=0; index < words.size(); index++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            Number_View.addView(wordView);
        }*/

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        //GridView gridview = (GridView) findViewById(R.id.list);
        //gridview.setAdapter(itemadapter);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Word word= words.get(i);
                mMediaPlayer = MediaPlayer.create(number.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class family extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    private MediaPlayer.OnCompletionListener mComletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("father","әpә", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("mother","әṭa", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("son","angsi", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("daughter","tune", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("older brother","taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("younger brother","chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("older sister","teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("younger sister","kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("grandmother","ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word("grandfather","paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

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

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Word word= words.get(i);
                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(family.this, word.getmAudioResourceId());
                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(mComletionListener);
            }
        });
    }
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}

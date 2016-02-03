package com.example.melih.btch;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Melih on 8.8.2015.
 */
public class RandomFragment extends android.support.v4.app.Fragment {

    MediaPlayer mediaPlayer;
    ArrayList<Objects.Quote> items;
    TextView quote;
    TextView qInfo;
    Button btn;
    Objects obj;
    static int fragmentID;

    public RandomFragment() {
        super();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.random_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        quote = (TextView) getActivity().findViewById(R.id.textView1);
        qInfo = (TextView) getActivity().findViewById(R.id.textView2);
        btn = (Button) getActivity().findViewById(R.id.RandBtn);
        obj = new Objects();
        items = obj.getQuotes();

        btn.setOnClickListener(new View.OnClickListener() {
            int index;

            @Override
            public void onClick(View v) {
                index = (int) (Math.random() * (items.size() - 1));
                playAudio(index);
            }
        });

    }

    public void playSelectedItemOnList(String text) {
        playAudio(obj.getTitles().indexOf(text));
    }

    private void playAudio(int index) {
        if(mediaPlayer != null){
            if(mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        }

        mediaPlayer = MediaPlayer.create(getActivity() , items.get(index).getAudioID());
        mediaPlayer.start();
        quote.setText(items.get(index).getQuote());
        qInfo.setText(items.get(index).getQuoteInfo());
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.reset();
            }
        });

    }

    public static RandomFragment newInstance() {
        RandomFragment randFrag = new RandomFragment();
        fragmentID = randFrag.getId();
        return randFrag;
    }


}
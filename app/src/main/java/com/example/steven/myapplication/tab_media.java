package com.example.steven.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by steven on 6-1-18.
 */

public class tab_media extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_media, container, false);
        Button youtube_button = (Button) rootView.findViewById(R.id.youtube_button);
        youtube_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("http://www.youtube.com/channel/UC7whh501qked5vYES1UlOQQ"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
